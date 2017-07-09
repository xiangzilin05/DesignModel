package class_06;

/**
 * Created by xianghui on 2017/7/9.
 */
public class Decorate {
    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("\n 第一种装扮：");

        xc.wearTShirts();
        xc.wearBigTrouser();
        xc.wearSneakers();
        xc.show();

        System.out.println("\n 第二种装扮：");
        xc.wearSuit();
        xc.wearTie();
        xc.wearLeatherShoes();
        xc.show();
    }
}
