package Decorator;

public class ConcreteDecoratorB extends Decorator {

    private String addedState;

    @Override
    public void Operation() {
        if(component!=null){
            component.Operation();
            addedState="小白白";
            System.out.println("去见："+addedState);
        }
    }
}
