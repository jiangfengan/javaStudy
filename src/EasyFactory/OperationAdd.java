package EasyFactory;

/**
 * 加法
 */
public class OperationAdd implements Operation{
    @Override
    public double getResult(double number1, double number2) {
        return number1+number2;
    }
}
