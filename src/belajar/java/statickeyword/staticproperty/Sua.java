package belajar.java.statickeyword.staticproperty;

/*
*
* Static Class, Method & Property
*
* Dalam Java kita dapat menggunakan keyword static pada sebuah inner class,
* method dan juga property.
*
* Ketika kita membuat static property dan static method, maka ketika
* kita ingin mengakses property dan methodnya kita tidak perlu untuk
* instansiasi objectnya.
*
* Ketila kita membuat static inner class, maka ketika ingin mengakses
* inner class nya, kita tidak perlu untuk menginstansiasi outer class nya terelbih
* dahulu. kita hanay tingal pelu menginstansaisi inner class nya. Tapi juga pakai
* static pada inner class, maka inner class tidak akan punya akeses ke outer class.
*
* contoh instansiasi static inner class:
* var outer = new OuterCless.InnerClass();
*
* Biasnaya static property akan di tulis menggunakan huruf kapital dan akan berupa
* final property. Juga biasnaya digunakan untuk membuat helpers
*
* */
public class Sua {
    public static String name = "Sua";
    public static String boyfriend = "Mathius";
    public static int CPUS;

    public static String sayHello() {
        // return name + "-shi oppa saranghae";
        // atau
        return Sua.name + "-shi oppa saranghae";
    }

    // Static block akan di ekeskeusi sekali sebelum class di load
    // Block static hanya bisa akses static method & property
    static {
        System.out.println("Called Static Block");
        // Mengakses jumla cpus cores
        CPUS = Runtime.getRuntime().availableProcessors();
    }

    public static class Love {
        public void showYourLove() {
            System.out.println("Sua ya nega noumu2 saranghae");
        }
    }
}
