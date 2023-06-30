package programmer.zaman.now.abstrak.kelas;

import programmer.zaman.now.abstrak.parent.Human;
import programmer.zaman.now.abstrak.child.KimSojung;
public class BelajarAbstractClass {
    public static void main(String[] args) {
        Human sowon = new KimSojung("Sojung", "Kim");
        sowon.sayHello();
    }
}
