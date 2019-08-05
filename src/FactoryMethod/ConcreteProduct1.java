package FactoryMethod;

/**
 * 具体方法1：猪
 */
public class ConcreteProduct1 implements Product{
    @Override
    public String newAnimal() {
        return "专业养猪";
    }
}
