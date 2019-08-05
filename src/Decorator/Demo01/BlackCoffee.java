package Decorator.Demo01;

/**
 * ConcreteComponent1
 */
public class BlackCoffee implements Coffee{
    private String descrption="选择了黑咖啡";
    private double money=30;

    @Override
    public String getDescrption() {
        return descrption;
    }

    @Override
    public double getMoney() {
        return money;
    }
}
