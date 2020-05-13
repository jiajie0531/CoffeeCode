package org.jiajie.coffeecode.jjvms;

import java.lang.reflect.Method;

public class ReflectTest1 {
    public static void target(int i) {
        new Exception("#" + i).printStackTrace();
    }

    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("org.jiajie.coffeecode.jjvms.ReflectTest1");
        Method method = klass.getMethod("target", int.class);
        for (int i = 0; i < 20; i++) {
            method.invoke(null, i);
        }
    }
}
