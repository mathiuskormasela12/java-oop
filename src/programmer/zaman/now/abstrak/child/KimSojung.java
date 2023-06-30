package programmer.zaman.now.abstrak.child;

import programmer.zaman.now.abstrak.parent.Human;

public class KimSojung extends Human{
    public KimSojung(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public void sayHello() {
        System.out.println("Hello this is " + this.getFirstName() + " " + this.getLastName());
    }
}
