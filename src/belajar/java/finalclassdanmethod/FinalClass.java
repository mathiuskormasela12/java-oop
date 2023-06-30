package belajar.java.finalclassdanmethod;

public class FinalClass {
    public static void main(String[] args) {

        Manusia mns = new Manusia();
        mns.sayHello();
    }
}

// Menggunakan keyword final pada class
// akan membuat class tersebut tidak akan bisa di extends
final class Manusia {
    public String name = "Manusia";

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}

//class Umji extends Manusia{
//    Umji() {
//        this.name = "Umji";
//    }
//}