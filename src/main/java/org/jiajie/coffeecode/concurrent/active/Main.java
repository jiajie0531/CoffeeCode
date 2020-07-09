package org.jiajie.coffeecode.concurrent.active;

import org.jiajie.coffeecode.concurrent.activeobject.ActiveObject;
import org.jiajie.coffeecode.concurrent.activeobject.ActiveObjectFactory;

/**
 * 测试程序行为的类
 *
 * @author jay
 */
public class Main {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MakerClientThread("Alice", activeObject).start();
        new MakerClientThread("Bobby", activeObject).start();
        new DisplayClientThread("Chris", activeObject).start();
    }
}
