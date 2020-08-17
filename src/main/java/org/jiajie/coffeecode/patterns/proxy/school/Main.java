package org.jiajie.coffeecode.patterns.proxy.school;

public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
