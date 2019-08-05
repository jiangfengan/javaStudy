package FactoryMethod;

/**
 * 具体工厂2：浙江养殖场
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product show() {
        System.out.println("浙江养殖场：我们是养狗场");
        return new ConcreteProduct2();
    }

    @Override
    public Product2 show2() {
        System.out.println("浙江养殖场：我们是卖油的");
        return new ConcreteProduct22();
    }
}
