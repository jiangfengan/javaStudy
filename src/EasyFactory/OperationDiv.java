package EasyFactory;

/**
 * 除法
 */
public class OperationDiv implements Operation{
    @Override
    public double getResult(double number1, double number2) throws Exception {
        if (number2 == 0) {
            throw new Exception("除数不能为0！");
        }
        return number1/number2;
    }
}
