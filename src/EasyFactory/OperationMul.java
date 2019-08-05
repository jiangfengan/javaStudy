package EasyFactory;

/**
 * 乘法
 */
public class OperationMul implements Operation{
    @Override
    public double getResult(double number1, double number2) {
        return number1-number2;
    }
}
