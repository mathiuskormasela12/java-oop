package belajar.java.finalclassdanmethod;

public class FinalMethod {
    public static void main(String[] args) {
        Macbook mbp = new MacbookPro("M2 Max");
        mbp.tampilkanSpesifikasi();
    }
}

class Macbook {
    public String noSeri = "";

    Macbook(String seri) {
        this.noSeri = seri;
    }

    // Menggunakan keyword final di sebuah method
    // akan membuat method tersebut tidak akan bisa di override
    public final void tampilkanSpesifikasi() {
        System.out.println("Macbook Air M1");
    }
}

class MacbookPro extends Macbook{
    MacbookPro(String seri) {
        super(seri);
    }

//    public void tampilkanSpesifikasi() {
//        System.out.println("Macbook Air M1");
//    }
}