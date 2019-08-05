package FactoryMethod;

/**
 * 具体方法1：向日葵
 */
public class ConcreteProduct21 implements Product2{
    @Override
    public String newPlant() {
        return "专业种向日葵";
    }
}
