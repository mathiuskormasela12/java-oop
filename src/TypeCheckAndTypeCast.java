public class TypeCheckAndTypeCast {
    public static void main(String[] args) {
        Person person = new Person("Mathius", "Kormasela");
        person.sayHello();

        person = new JungYerin("Yerin", "Jung", "Mathius");
        start(person);
    }

    public static void start(Person person) {
        // Type Checking
        // Mengecek tipe data
        // Apakah person itu instans dari class JungYerin ?
        // klo ya maka akan menghasilkan boolean true
        // tetapi jika tidak akan menghasilkan boolean false
        if(person instanceof JungYerin) {
            // Type Casting
            // Convert ke tipe data lain
            // Convert tipe data Person ke JungYerin
            // sehinggua bisa mengakses method check
            JungYerin myWife = (JungYerin) person;
            myWife.sayHello();
            myWife.check();
        } else {
            person.sayHello();
        }
    }
}