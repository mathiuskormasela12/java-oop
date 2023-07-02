package belajar.java.enums;

// Untuk membuat jenis data yg nilai nya terbatas
// secara default enum akan extends ke class java.lang.Enum oleh
// sebab itu enum tidak bisa extends class lain, tapi untuk implement interface bisa
public enum EnumData {

    SOWON(),
    YERIN(),
    EUNHA("Wwkwkw");
    // setiap data nya di pisah dengan tanda koma, klo ada method baru tutup dengan semi colon

    public String name;

    // Membuat constructor
    // consturctos gk bisa public klo di enum
    EnumData() {
        System.out.println("Object Created");
    }

    // Membuar overloading constructor
    // tapi wajib call constructor utamanya
    EnumData(String nameValue) {
        this();
        this.name = nameValue;
    }
}
