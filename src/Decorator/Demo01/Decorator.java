package Decorator.Demo01;

/**
 * 装饰器抽象类
 */
public class Decorator implements Coffee{
    @Override
    public String getDescrption() {
        return "我只是装饰器，我什么都不知道";
    }

    @Override
    public double getMoney() {
        return 0;
    }
}
