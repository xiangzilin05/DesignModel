package class_06;

/**
 * Created by xianghui on 2017/7/9.
 */
public class Decorate {
    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("\n 第一种装扮：");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();

        dtx.show();
        kk.show();
        pqx.show();
        xc.show();

        System.out.println("\n 第二种装扮：");
        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();

        xz.show();
        ld.show();
        px.show();
        xc.show();
    }
}
