package org.jiajie.coffeecode.concurrent.single;

import java.util.Random;

public class UserThread extends Thread {
    private final static Random random = new Random(26535);
    private final BoundedResource resource;
    private final Gate gate;
    private final String myname;
    private final String myaddress;

    public UserThread(BoundedResource resource, Gate gate, String myname, String myaddress) {
        this.resource = resource;
        this.gate = gate;
        this.myname = myname;
        this.myaddress = myaddress;
    }

    @Override
    public void run() {
        System.out.println(myname + " BEGIN");
//        while (true) {
//            gate.pass(myname, myaddress);
//        }
        try {
            while (true) {
                resource.use();
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
