package Decorator;

public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("请装饰一下我");
    }
}
