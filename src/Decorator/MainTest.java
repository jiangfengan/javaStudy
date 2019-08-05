package Decorator;

public class MainTest {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent=new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();
        ConcreteDecoratorC c = new ConcreteDecoratorC();
        a.setComponent(concreteComponent);
        b.setComponent(a);
        c.setComponent(b);
        c.Operation();
    }
}
