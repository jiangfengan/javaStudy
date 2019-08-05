package EasyFactory;

/**
 * 减法
 */
public class OperationSub implements Operation{
    @Override
    public double getResult(double number1, double number2) {
        return number1*number2;
    }
}
