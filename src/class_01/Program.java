package class_01;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Program {
    public static void main(String[] args) throws IOException {
        try
        {
            Scanner sc = new Scanner(System.in);
            Operation oper;
            System.out.println("please input number A :");
            String strNumA = sc.nextLine();
            int intNumA = Integer.valueOf(strNumA);
            System.out.println("please input mark :");
            String strOperate = sc.nextLine();
            System.out.println("please input number B :");
            String strNumB = sc.nextLine();
            int intNumB = Integer.valueOf(strNumB);
//            oper = OperFactory.createOperate(strOperate);
//            oper.numA = Integer.valueOf(strNumA);
//            oper.numB = Integer.valueOf(strNumB);

            System.out.println("the two nums are: " + intNumA + " and " +
                    intNumB + " while the mark is \"" + strOperate +"\"");
            double strResult = 0;

            Operation operation = OperationFactory.createOperate(strOperate);
            operation.setNumberA(intNumA);
            operation.setNumberB(intNumB);
            strResult = operation.GetResult();

            System.out.println("the result is : " + strResult);
        }
        catch(Exception ex)
        {
            System.out.println("you have something wrong : " + ex.getMessage());
        }
    }
}
