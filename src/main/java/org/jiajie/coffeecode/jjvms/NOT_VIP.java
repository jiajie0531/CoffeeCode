package org.jiajie.coffeecode.jjvms;

public class NOT_VIP implements Customer {

    @Override
    public String purchase() {
        return "VIP First !";
    }
}
