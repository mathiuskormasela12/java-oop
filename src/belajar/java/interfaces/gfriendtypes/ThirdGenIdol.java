package belajar.java.interfaces.gfriendtypes;

// extend multiple interface
public interface ThirdGenIdol extends IGirlGroup, IGfriend{
    final String agency = "JYP";
}


// implement multiple interfaces di class
class Opso implements IGirlGroup, IGfriend{

    public void sayHello() {
        System.out.println("Jalankan");
    }

    public void kapanDebut() {
        System.out.println("Nlm tau");
    }
}