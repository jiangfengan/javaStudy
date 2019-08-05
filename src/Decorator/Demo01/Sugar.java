package Decorator.Demo01;

/**
 * ConcreteDecoratorA
 */
public class Sugar extends Decorator {
    String descrption="加了糖";
    double money=2;

    private Coffee coffee;

    public Sugar(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getDescrption() {
        return coffee.getDescrption()+"\n"+descrption;
    }

    @Override
    public double getMoney() {
        return coffee.getMoney()+money;//加了糖多3元
    }
}
