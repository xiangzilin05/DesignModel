package class_06;

/**
 * Created by xianghui on 2017/7/9.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
