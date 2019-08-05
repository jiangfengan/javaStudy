package Procuration;

public class Main {
    public static void main(String[] args) {
        FoodDelivered tea=new Tea();
        FoodDelivered shop=new Shop();
        MeiTuan meiTuan=new MeiTuan(shop);
        meiTuan.send();
        meiTuan=new MeiTuan(tea);
        meiTuan.send();
    }
}
