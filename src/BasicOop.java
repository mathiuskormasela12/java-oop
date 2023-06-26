class BasicOop {
    // Membuat property/attributes/fields
    // Sama kyk buat variable, bahkan bisa pake keyword final
    String firstName;
    String lastName;
    int age = 20;

    // Constructor method
    // Akan di panggil ketika object di instansiasi
    // Nama constructor method wajib sama dengan nama class nya kalau tidak maka akan error.
    // Constructor method tidak perlu pakai keyword void atau me return value
    BasicOop(String name) {
        firstName = name;
    }

    // Constructor method bisa juga
    // melakukan method overloading
    // dimana ada dua atau lebih constructor method
    // asalkan paramater atau tipe data parameternya berbeda.
    BasicOop() {
        System.out.println("Instantiate Object");
    }

    BasicOop(String firstName, String lastName, int age) {
        // Memanggil constructor lain bisa mengguanakn keyword this
        this();

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void sayHello() {
        // Untuk akses property/attributes/fields kita bisa languns menyebutkan nama propertynya
        // tidak perlu pakai keyword this. Tapi hati-hati, jikalau tidak pake keyword this
        // terkadang bisa terjadi issue Variable Shadowing ketika nama parameter method atau constructor
        // sama dengan nama property class nya.
        // Ketika memakai keyword this maka issue variable shadowing akan tersolve
        System.out.println("Hello " + firstName + ". are you " + age + " years old");
    }

    void test(String firstName) {
        // Kita harus pake keyword this untuk mengakse method atau property dalam class
        // agar tidak terjadi variable shadowing
        // Variable shadowing dmna sebuah case dimana ketika kita mengakses sebuah variable maka Java akan
        // mengambil variable yg terdekat dan hal itu menyebabkan property object akan ke timpa oleh paremeter method
        // ketika nama nya sama.
        System.out.println("Hajimemashite " + this.firstName + " " + firstName);
        this.sayHello();
    }
}