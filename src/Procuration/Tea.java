package Procuration;

public class Tea implements FoodDelivered {
    @Override
    public void send() {
        System.out.println("送一壶茶");
    }
}
