package class_01;

/**
 * Created by Administrator on 2017/6/30.
 */
public class OperationDiv extends Operation {
    @Override
    public double GetResult(){
        if (numberB == 0)
            try {
                throw new Exception("除数不能为0！！！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        return numberA / numberB;
    }
}
