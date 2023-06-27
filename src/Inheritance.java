public class Inheritance {
    public static void main(String[] args) {
        // By default di Java, setiap membuat class baru, otomatis Java akan meng extendnya dgn class Object
        // Jadi bisa di bilang class Object merupakan parent class dari setiap class di Java.
        // contoh method dari class Object adalah .toString
        Yerin myWife = new Yerin("Yennie");
        myWife.sayHello();
    }
}

class Manusia {
    String name;
    Manusia(String name) {
        this.name = name;
    }

    void test() {
        System.out.println("TEST");
    }

    void sayHello() {
        System.out.println("Hello Manusia");
    }
}

/*
* Inheritance Untuk melakukan pewarisan
*
* */
class Yerin extends Manusia {
    // Dalam Java ketika parent class memiliki constructor method yg memiliki parameter
    // maka di child class nua mesti manggil constructor method parent class dengan
    // keyworrt super. tpi klo constructor class nya gk punya parameter maka gk perlu panggil constructor parent class nya
    Yerin(String nama) {
        // Memanggil constructor method dari parent class
        super(nama);
    }

    // Melakukan overriding
    // Overriding merupakan
    // sebuah cara untuk membuat
    // method di child class dengan nama
    // yg sma dengan method yg ada di parent class
    void sayHello() {
        // Mengakses method dari parent, selain method bisa di pake untuk akses property parentnya juga
        super.sayHello();
        System.out.println("Hello Yerin");
    }
}