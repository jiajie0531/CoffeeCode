package org.jiajie.coffeecode.concurrent.storage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {
    private static final ThreadLocal<TSLog> tsLogCollection = new ThreadLocal<>();

    // write log
    public static void println(String s){
        getTSLog().println(s);
    }

    // close log
    public static void close(){
        getTSLog().close();
    }

    // get tsLog
    private static TSLog getTSLog(){
        TSLog tsLog = tsLogCollection.get();

        // 如果该线程是第一次调用本地方法，就新生成并注册一个日志
        if (tsLog == null) {
            tsLog = new TSLog(Thread.currentThread().getName() + "-log.txt");
            tsLogCollection.set(tsLog);
        }
        return tsLog;
    }
}
