package belajar.java.innerclass;

public class BelajarInnerClass extends ParentClass {
    private String firstName = "Mathius";
    private String lastName = "Kormasela";

    /*
    *
    * Inner Class
    *
    * Java memungkinkan kita untuk membuat class
    * di dalam class. Ini dinamakan inner class.
    * Kelebihan dari inner class adalah kita bisa mengakses
    * setiap property & method dari outer class meskipun
    * access modifier nya adalah private.
    *
    * Untuk mengakses outer class method/property bisa menggunakan
    * NamaOuterClass.this.namaPropertyAtauMethod
    *
    * Untuk mengakses method/propertu dari parent class dari outer class nya
    * NamaOuterClass.super.namaPropertyAtauMethod
    *
    * Untuk instansiasi inner class
    * var outerClass = new OuterClass();
    * var innerClass = outerClass.new OuterClass();
    *
    * */
    public class InnerClass {
        public void sayHello() {
            // mengakses method dari parent class nya outer class
            BelajarInnerClass.super.jalan();

            // Mengakses property dari outer class
            System.out.println("Hello my name is " + BelajarInnerClass.this.firstName + " " + BelajarInnerClass.this.lastName);
        }
    }
}
