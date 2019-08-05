package Decorator.Demo01;

/**
 * ConcreteComponent2
 */
public class WhiteCoffee implements Coffee{
    private String descrption="选择了白咖啡";
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
