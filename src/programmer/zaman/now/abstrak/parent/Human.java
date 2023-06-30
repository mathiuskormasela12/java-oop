package programmer.zaman.now.abstrak.parent;

/*
*
* Abstract Class merupakan sebuah class yang tidak
* dapat di instansiasi dan harus di buat extendnya jika
* ingin di instansiasi.
*
* Dalam Java abstract class tidak wajib untuk memiliki
* abstarct method.
* */
public abstract class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // membuat abstract method
    public abstract void sayHello();

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
