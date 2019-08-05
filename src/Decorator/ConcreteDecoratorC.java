package Decorator;

public class ConcreteDecoratorC extends Decorator {

    @Override
    public void Operation() {
        component.Operation();
        System.out.println("然后去吃饭");
    }
}
