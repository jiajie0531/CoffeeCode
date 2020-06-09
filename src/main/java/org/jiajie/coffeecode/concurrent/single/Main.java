package org.jiajie.coffeecode.concurrent.single;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Testing Gate, hit CTRL+C to exit.");
//
        Gate gate = new Gate();
//
//        new UserThread(gate, "Alice", "Alaska").start();
//        new UserThread(gate, "Bobby", "Brazil").start();
//        new UserThread(gate, "Chris", "Chris").start();

        // 设置 3 个资源
        BoundedResource resource = new BoundedResource(3);

        // 10个线程使用资源
        for (int i = 0; i < 10; i++) {
            new UserThread(resource, gate, "Alice", "Alaska").start();
        }
    }
}
