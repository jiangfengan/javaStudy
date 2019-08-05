package FactoryMethod;

/**
 * 具体工厂1：湖南养殖场
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product show() {
        System.out.println("湖南养殖场：我们是养猪场");
        return new ConcreteProduct1();
    }

    @Override
    public Product2 show2() {
        System.out.println("湖南养殖场：我们是卖瓜子的");
        return new ConcreteProduct21();
    }
}
