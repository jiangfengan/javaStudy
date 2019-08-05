package EasyFactory;

/**
 * 简单工厂
 */
public class OperationFactory {

    public static Operation createOperation(String oper){
        Operation operation=null;
        switch (oper){
            case "+":
                operation=new OperationAdd();
                break;
            case "-":
                operation=new OperationSub();
                break;
            case "*":
                operation=new OperationMul();
                break;
            case "/":
                operation=new OperationDiv();
                break;
        }
        return operation;
    }
}
