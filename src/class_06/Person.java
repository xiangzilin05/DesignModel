package class_06;

import java.net.SocketPermission;

/**
 * Created by xianghui on 2017/7/6.
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void wearTShirts(){
        System.out.println("大T恤");
    }

    public void wearBigTrouser(){
        System.out.println("垮裤");
    }

    public void wearSneakers(){
        System.out.println("破球鞋");
    }

    public void wearSuit(){
        System.out.println("西装");
    }

    public void wearTie(){
        System.out.println("领带");
    }

    public void wearLeatherShoes(){
        System.out.println("皮鞋");
    }

    public void Show(){
        System.out.println("装扮的" + name);
    }
}

















