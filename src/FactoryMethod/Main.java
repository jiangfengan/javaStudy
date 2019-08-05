package FactoryMethod;

public class Main {
    public static void main(String[] args) throws Exception{
        // 使用反射机制实例化工厂对象，因为字符串是可以通过变量改变的
        AbstractFactory pigFactory = (AbstractFactory) Class.forName("FactoryMethod.ConcreteFactory1").newInstance();
        // 通过工厂对象创建相应的实例对象
        Product pig = pigFactory.show();
        System.out.println(pig.newAnimal());
        Product2 sun=pigFactory.show2();
        System.out.println(sun.newPlant());

        AbstractFactory dogFactory=(AbstractFactory) Class.forName("FactoryMethod.ConcreteFactory2").newInstance();
        Product dog = dogFactory.show();
        System.out.println(dog.newAnimal());
        Product2 rape=dogFactory.show2();
        System.out.println(rape.newPlant());
    }
}
