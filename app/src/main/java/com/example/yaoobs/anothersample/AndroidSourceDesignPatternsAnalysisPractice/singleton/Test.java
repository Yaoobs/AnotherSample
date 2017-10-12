package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice.singleton;

/**
 * Created by yaoobs on 2017/10/12.
 */

public class Test {
    public static void main(String[] args) {
        Company cp = new Company();
        //CEO对象只能通过getCeo函数获取
        Staff ceo1 = CEO.getCeo();
        Staff ceo2 = CEO.getCeo();
        cp.addStaff(ceo1);
        cp.addStaff(ceo2);
        //通过new创建VP对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        //通过new创建Staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        cp.addStaff(vp1);
        cp.addStaff(vp2);
        cp.addStaff(staff1);
        cp.addStaff(staff2);
        cp.addStaff(staff3);

        cp.showAllStaffs();
    }
}
