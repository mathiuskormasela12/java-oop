package belajar.java.innerclass;

public class Main {
    public static void main(String[] args) {
        // Instanssiasi inner class
        // mesti buat object dari outer class nya dulu
        var classUtama = new BelajarInnerClass();
        var innerClassnya = classUtama.new InnerClass();
        innerClassnya.sayHello();
    }
}
