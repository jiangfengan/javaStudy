package Decorator;

public class ConcreteDecoratorA extends Decorator {

    @Override
    public void Operation() {
        if(component!=null){
            component.Operation();
            System.out.println("带朵小红花");
        }
    }
}
