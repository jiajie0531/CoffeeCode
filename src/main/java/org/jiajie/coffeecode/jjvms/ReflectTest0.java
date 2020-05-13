package org.jiajie.coffeecode.jjvms;

import java.lang.reflect.Method;

public class ReflectTest0 {
    public static void target(int i) {
        new Exception("#" + i).printStackTrace();
    }

    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("org.jiajie.coffeecode.jjvms.ReflectTest0");
        Method method = klass.getMethod("target", int.class);
        method.invoke(null, 0);
    }
}
