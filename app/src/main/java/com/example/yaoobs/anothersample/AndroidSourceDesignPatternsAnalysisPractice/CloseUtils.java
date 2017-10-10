package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by yaoobs on 2017/10/10.
 */

public final class CloseUtils {
    /* *
     *  关闭 Closeable 对象
     *  @param closeable
     */
    public static void closeQuietly(Closeable closeable){
        if (null != closeable) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
