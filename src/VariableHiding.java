public class VariableHiding {
    public static void main(String[] args) {
        Viviz viviz = new Viviz();
        System.out.println("Before Type Casting");
        viviz.sayHello();
        System.out.println(viviz.name);

        System.out.println("");

        System.out.println("After Type Casting");
        // Conversi variable viviz yg tadinya di bertipe data kan Viviz
        // menjadi tipe data Gfriend dan assign ke variable viviz2
        Gfriend viviz2 = (Gfriend) viviz;
        // Akan mengeksekusi method sayHello dari child class, karena hal ini adalah method overriding
        viviz2.sayHello();

        // Akan menampilkan property name dari parent class, karena tidak ada yg namanya variable/property hiding
        // ada nya yg nama nya varibale hiding, dimana ada parameter method yg nama nya sama dengan property class
        // baik dri class child atau class parent.
        System.out.println(viviz2.name);
    }
}

class Gfriend {
    String name = "Gfriend";

    void sayHello() {
        System.out.println("Hi this is " + name);
    }
}

class Viviz extends Gfriend {
    String name = "Viviz";

    void sayHello() {
        // Memanggil method parent class
        // super.sayHello();
        System.out.println("Hi this is " + name);
    }
}
