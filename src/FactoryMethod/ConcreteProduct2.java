package FactoryMethod;

/**
 * 具体类：狗
 */
public class ConcreteProduct2 implements Product{
    @Override
    public String newAnimal() {
        return "专业养狗";
    }
}
