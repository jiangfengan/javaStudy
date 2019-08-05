package FactoryMethod;

/**
 * 抽象工厂：养殖场
 */
public interface AbstractFactory {
    //养动物
    Product show();
    //养植物
    Product2 show2();
}
