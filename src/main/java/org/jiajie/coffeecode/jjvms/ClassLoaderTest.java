package org.jiajie.coffeecode.jjvms;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {

        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = myLoader.loadClass("org.jiajie.coffeecode.jjvms.ClassLoaderTest").newInstance();

        System.out.println(obj.getClass());

        // 一个是由系统应勇程序类加载器加载的，另外一个是由自定义加载器加载的，
        // 虽然都来自于同一个Class文件，但依然是两个独立但类，做对象所属类型检查时结果自然为false。
        System.out.println(obj instanceof org.jiajie.coffeecode.jjvms.ClassLoaderTest);

    } // end of main

}
