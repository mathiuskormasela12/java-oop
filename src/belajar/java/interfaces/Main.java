package belajar.java.interfaces;

import belajar.java.interfaces.gfriend.YeojaChingu;
public class Main {
    public static void main(String[] args) {
        YeojaChingu gfriend = new YeojaChingu();
        gfriend.sayHello();

        // menggunakan .toString method yg udh kite overried
        System.out.println(gfriend.toString());
        // atau
        System.out.println(gfriend);
    }
}
