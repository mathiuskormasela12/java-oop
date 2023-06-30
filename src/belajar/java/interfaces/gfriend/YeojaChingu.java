package belajar.java.interfaces.gfriend;

import belajar.java.interfaces.gfriendtypes.IGfriend;


public class YeojaChingu implements IGfriend {
    int kpnDebut = 2015;

    public YeojaChingu() {
     this.kapanDebut();
    }
    public void sayHello() {
        this.jalan();
        System.out.println("Hello this is " + this.fullName);
    }
    public void kapanDebut() {
        System.out.println("Debut di tahun 2015");
    }

    // Overried toString method agar dapat
    // menampilkan value object lebih cantik
    public String toString() {
        return "Kapan Debut : " + String.valueOf(kpnDebut);
    }
}
