package org.jiajie.coffeecode.patterns.state;

public class Client {

    public static void main(String[] args) {

        /*
            Context是客户使用的主要接口。
            客户可用状态对象来配置一个Context，一旦一个Context配置完毕，它的客户不再需要与状态对象打交道。
         */
        Context context = new Context();

        /*
            Context或ConcreteState子类都可决定哪个状态是另外哪一个的后继者，
            以及是在何种条件下进行状态转换。
         */
        context.changeState( new ConcreteStateA() );
        context.request();

        context.changeState( new ConcreteStateB() );
        context.request();
    }
}
