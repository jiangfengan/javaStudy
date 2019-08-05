package Decorator.Demo01;
/**
 * ConcreteDecoratorB
 */
public class Milk extends Decorator {
    String descrption="加了牛奶";
    double money=3;

    private Coffee coffee;

    public Milk(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getDescrption() {
        return coffee.getDescrption()+"\n"+descrption;
    }

    @Override
    public double getMoney() {
        return coffee.getMoney()+money;//加了牛奶多3元
    }
}
