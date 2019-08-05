package Procuration;

public class MeiTuan implements FoodDelivered {

    private FoodDelivered foodDelivered;

    /**
     * 传入类型FoodDelivered的好处是：只要实现了FoodDelivered接口的所有类都可以
     * @param foodDelivereds
     */
    public MeiTuan(FoodDelivered foodDelivereds){
        this.foodDelivered=foodDelivereds;
    }

    /**
     * 代理
     */
    @Override
    public void send() {
        System.out.println("美团来了：");
        foodDelivered.send();
    }
}
