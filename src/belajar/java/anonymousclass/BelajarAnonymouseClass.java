package belajar.java.anonymousclass;

public class BelajarAnonymouseClass {
    public static void main(String[] args) {
        /*
        *
        * Anonymouse Class
        *
        * Dalam Java memungkinkan kita untuk menginstansiasi
        * interface atau abtract class tanpa harus membuat class
        * implementasinya. Ini dinamakan anonymous class.
        *
        * */
        //
        // Cara membuat anonymon class
        // Jadi kita hanya tinggal instansiasi class nya
        // kekurangannya adalah gk reusable, dimana setiap method nya akan hrus kita buat ulang
        // ketika menginstansiasi object nya lgi.
        IAnonim anonim = new IAnonim(){
            public void helloWorld() {
                System.out.println("Umji noona saranghae");
            }
        };

        anonim.helloWorld();
    }
}
