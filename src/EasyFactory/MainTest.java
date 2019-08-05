package EasyFactory;

public class MainTest {
    public static void main(String[] args) throws Exception  {
        Operation add=OperationFactory.createOperation("+");
        Operation sub=OperationFactory.createOperation("-");
        Operation mul=OperationFactory.createOperation("*");
        Operation div=OperationFactory.createOperation("/");

        System.out.println(add.getResult(2, 1));
        System.out.println(sub.getResult(2, 1));
        System.out.println(mul.getResult(2, 1));
        System.out.println(div.getResult(2, 1));
    }
}
