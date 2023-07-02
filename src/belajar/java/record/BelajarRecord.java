package belajar.java.record;

// Record berguna untuk membuat object yg hanya berisi data2 saja
// record bersifat immutable, jadi hanya bisa di read tapi tidak bisa write.
// oleh sebab itu ketika kita kita membuat record, otomatis
// akan di buatkan constructor, property dan juga getter method
// namun tidak setter method, karena emang gk bisa di ubah field nya
public record BelajarRecord(String firstName, String lastName) {
    // Compact Constructor
    // ini klo mau bikin constructor sendiri di record class
    public BelajarRecord {
        System.out.println("Jalan");
    }

    // Kalo mau bikin constructor overloading
    // kita tetep harus akes main constructornya
    public BelajarRecord(String nawa) {
        // mengakses main constructor
        this(nawa, null);

        System.out.println("Value => " + this.firstName);
    }
}
