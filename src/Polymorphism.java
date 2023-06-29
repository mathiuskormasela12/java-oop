public class Polymorphism {
    public static void main(String[] args) {
        /*
        *
        * Polymorphism merupakan sebuah behaviour dalam
        * OOP yang memungkinkan kita untuk menginstansiasi class
        * pada variable yg bertipe data kan parent class nya.
        *
        * Contoh kita membuat variable dengan nama person dan kita
        * set tipe data nya sbg class Person, terus kita reassign
        * variable tersebut dengna class turunannya yaitu class JungYerin.
        * Maka sekagrang variable person berisikna object jung yerin.
        *
        * Jadi gampangnya Polymorphism merupakan cara variable
        * untuk dapat berubah-ubah.
        *
        * */

        // Instantiate class Person
        Person person = new Person("Mathius", "Kormasela");
        // Ini akan memanggil method dari class Person
        person.sayHello();

        // Melakukan Polymorphism
        // Reassign variable person dan instantiate dengan class JungYerin
        person = new JungYerin("Yerin", "Jung", "Mathius");
        // Ini akan memangil method dari class Jung Yerin, karena method sayHello ada juga di parent class
        person.sayHello();

        // Setiap method dan property yg ada di child class tidak bisa di akses
        // Jikalau di parent class nya tidak ada property & method dengan nama yg sama.
        // Contoh di bawah, knp error? karena di class Person tidak ada method check
        // method check hanya ada di child class nya.
        // person.check();
    }
}

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sayHello() {
        System.out.println("Hi " + this.firstName + " " + this.lastName + " " + "(Person)");
    }
}

class JungYerin extends Person {
    String namjaChingu;

    JungYerin(String firstName, String lastName, String namjaChingu) {
        super(firstName, lastName);
        this.namjaChingu = namjaChingu;
    }

    public void sayHello() {
        System.out.println("Hi " + this.firstName + " " + this.lastName + " " + " your boyfirend is " + this.namjaChingu + " " + "(JungYerin)");
    }

    public void check() {
        System.out.println("Check");
    }
}
