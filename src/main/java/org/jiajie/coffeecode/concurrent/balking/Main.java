package org.jiajie.coffeecode.concurrent.balking;

/**
 * 测试程序行为的类
 *
 * @author jay
 */
public class Main {

    public static void main(String[] args) {
        Data data = new Data("data.txt", "(empty)");
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }

}
