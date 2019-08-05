package Procuration;

public class Shop implements FoodDelivered {
    @Override
    public void send() {
        System.out.println("送一包老坛酸菜牛肉面");
    }
}
