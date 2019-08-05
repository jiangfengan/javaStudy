package Decorator.Demo01;

public class TestMain {
    public static void main(String[] args) {
        Coffee coffee=new BlackCoffee();//选择黑咖啡
        coffee=new Milk(coffee);//加入牛奶
        coffee=new Sugar(coffee);//加入糖
        System.out.println(coffee.getDescrption()+"\n"+coffee.getMoney());
        Coffee coffee2=new WhiteCoffee();//选择了白咖啡
        coffee2=new Sugar(coffee2);//加入糖
        coffee2=new Sugar(coffee2);//加入糖
        System.out.println(coffee2.getDescrption()+"\n"+coffee2.getMoney());
        System.out.println("乱入一波");
        System.out.println("新建的一个分支");
    }
}
