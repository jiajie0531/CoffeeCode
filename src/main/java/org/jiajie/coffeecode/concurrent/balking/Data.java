package org.jiajie.coffeecode.concurrent.balking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 表示可以修改并保存的数据的类
 *
 * @author jay
 */
public class Data {
    /**
     * 保存的文件名称
     */
    private final String filename;
    /**
     * 数据内容
     */
    private String content;
    /**
     * 修改后
     * changed = true 便是守护条件
     */
    private boolean changed;

    public Data(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    /**
     * 用于修改数据内容的方法
     *
     * @param newContent    数据内容
     */
    public synchronized void changed(String newContent){
        content = newContent;
        changed = true;
    }

    /**
     * guardedMethod
     *
     * @throws IOException  exception
     */
    public synchronized  void save() throws IOException {
        if (!changed) {
            return;
        }
        doSave();
        changed = false;
    }

    /**
     * 将数据内容实际保存到文件中
     *
     * stateChangingMethod
     */
    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
        Writer writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}
