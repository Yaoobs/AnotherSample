package com.example.yaoobs.anothersample.xiaozhuanlan.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author yaozheng
 * introduce :
 * PACKAGE_NAME com.eastmoney.android.fund.activity.proxy.dynamic_proxy
 * PROJECT_NAME FundAs
 * DATE  2019/4/25 7:50 PM
 */
class TimeConsumeProxy implements InvocationHandler {

    private Object realObject;

    public Object bind(Object realObject) {
        this.realObject = realObject;
        Object proxyObject = Proxy.newProxyInstance(//$Proxy0.class
                this.realObject.getClass().getClassLoader(),
                this.realObject.getClass().getInterfaces(),
                this
        );

        return proxyObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = method.invoke(proxy, args);

        System.out.println("耗时：" + (System.currentTimeMillis() - start));

        return result;
    }
}

//    public static void main(String[] args) {
//        A a = new A();
//        IAFunc aProxy = (IAFunc) new TimeConsumeProxy().bind(a);
//        aProxy.doA();
//
//        B b = new B();
//        IBFunc bProxy = (IBFunc) new TimeConsumeProxy().bind(b);
//        bProxy.doB();
//    }

//final class $Proxy0 extends Proxy implements IAFunc {
//    private static Method m1;
//    private static Method m3;
//    private static Method m2;
//    private static Method m0;
//
//    public $Proxy0(InvocationHandler var1) throws  {
//        super(var1);
//    }
//
//    public final boolean equals(Object var1) throws  {
//        // 省略
//    }
//
//    public final void doA() throws  {
//        try {
//            // 划重点
//            super.h.invoke(this, m3, (Object[])null);
//        } catch (RuntimeException | Error var2) {
//            throw var2;
//        } catch (Throwable var3) {
//            throw new UndeclaredThrowableException(var3);
//        }
//    }
//
//    public final String toString() throws  {
//        // 省略
//    }
//
//    public final int hashCode() throws  {
//        // 省略
//    }
//
//    static {
//        try {
//            // 划重点
//            m3 = Class.forName("proxy.IAFunc").getMethod("doA", new Class[0]);
//
//            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[]{Class.forName("java.lang.Object")});
//            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
//            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
//        } catch (NoSuchMethodException var2) {
//            throw new NoSuchMethodError(var2.getMessage());
//        } catch (ClassNotFoundException var3) {
//            throw new NoClassDefFoundError(var3.getMessage());
//        }
//    }
//}

//Proxy.newInstance():
//    public static Object newProxyInstance(ClassLoader loader,
//                                          Class<?>[] interfaces,
//                                          InvocationHandler h) {
//        //复制要代理的接口
//        final Class<?>[] intfs = interfaces.clone();
//
//        //重点：生成 $Proxy0.class 文件并通过 ClassLoader 加载进来
//        Class<?> cl = getProxyClass0(loader, intfs);
//
//        //对$Proxy0.class生成一个实例，就是`proxyObject`
//        final Constructor<?> cons = cl.getConstructor(constructorParams);
//        return cons.newInstance(new Object[]{h});
//    }


//    getProxyClass0 的具体实现：ProxyClassFactory工厂类：
//    @Override
//    public Class<?> apply(ClassLoader loader, Class<?>[] interfaces) {
//        // 参数为ClassLoader和要代理的接口
//
//        Map<Class<?>, Boolean> interfaceSet = new IdentityHashMap<>(interfaces.length);
//
//        // 1. 验证ClassLoader和接口有效性
//        for (Class<?> intf : interfaces) {
//            // 验证classLoader正确性
//            Class<?> interfaceClass = Class.forName(intf.getName(), false, loader);
//            if (interfaceClass != intf) {
//                throw new IllegalArgumentException(
//                        intf + " is not visible from class loader");
//            }
//
//            // 验证传入的接口class有效
//            if (!interfaceClass.isInterface()) { ... }
//
//            // 验证接口是否重复
//            if (interfaceSet.put(interfaceClass, Boolean.TRUE) != null) { ... }
//        }
//
//        // 2. 创建包名及类名 $Proxy0.class
//        proxyPkg = ReflectUtil.PROXY_PACKAGE + ".";
//        long num = nextUniqueNumber.getAndIncrement();
//        String proxyName = proxyPkg + proxyClassNamePrefix + num;
//
//        // 3. 创建class字节码内容
//        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(proxyName, interfaces, accessFlags);
//
//        // 4. 基于字节码和类名，生成Class<?>对象
//        return defineClass0(loader, proxyName, proxyClassFile, 0, proxyClassFile.length);
//    }

//    生成class内容 ProxyGenerator.generateProxyClass：

    // 添加 hashCode equals toString方法
//    addProxyMethod(hashCodeMethod, Object.class);
//    addProxyMethod(equalsMethod, Object.class);
//    addProxyMethod(toStringMethod, Object.class);
//
//// 添加委托类的接口实现
//for (int i = 0; i < interfaces.length; i++) {
//        Method[] methods = interfaces[i].getMethods();
//        for (int j = 0; j < methods.length; j++) {
//        addProxyMethod(methods[j], interfaces[i]);
//        }
//        }
//
//// 添加构造函数
//        methods.add(this.generateConstructor());

//    ByteArrayOutputStream bout = new ByteArrayOutputStream();
//    DataOutputStream dout = new DataOutputStream(bout);
// dout.writeInt(0xCAFEBABE);
//         ...
//         dout.writeShort(ACC_PUBLIC | ACC_FINAL | ACC_SUPER);
//         ...
//         return bout.toByteArray();

//动态代理可以随时为任意的委托类进行代理，并可以在InvocationHandler#invoke拿到运行时的信息，并可以做一些切面处理。
//
//        在动态代理背后，其实是为一个委托类动态生成了一个$Proxy0.class的代理类，该代理类会实现委托类的接口，并把接口调用转发到InvocationHandler#invoke上，最终调用到真实委托类的对应方法。
//
//        动态代理机制把委托类和代理类进行了隔离，提高了扩展性。