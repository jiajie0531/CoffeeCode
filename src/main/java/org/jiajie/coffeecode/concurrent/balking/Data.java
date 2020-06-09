package org.jiajie.coffeecode.concurrent.balking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 表示可以修改并保存的数据的类
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
     */
    private boolean changed;

    public Data(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    public synchronized void changed(String newContent){
        content = newContent;
        changed = true;
    }

    public synchronized  void save() throws IOException {
        if (!changed) {
            return;
        }
        doSave();
        changed = false;
    }

    /**
     * 将数据内容实际保存到文件中
     */
    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
        Writer writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}
