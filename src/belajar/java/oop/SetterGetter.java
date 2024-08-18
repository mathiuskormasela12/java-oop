package belajar.java.oop;

public class SetterGetter {
    /*
    * Dalam Java OOP, terdapat konsem Encapsulation.
    * Dimana setiap property dalam object harus selalu
    * dipastikan datanya baik dan valid. Oleh sebab itu
    * Programmer Java akan selalu membuat setiap property
    * dalam sebuah class menggunakan access modifief private.
    * Guna untuk memastikan property-propety tersebut valid.
    *
    * Lalu ketika ingin memodifikasi atau mengambil nilai
    * dari setiap property tersebut, kita dapat menggunakan
    * setter & getter method. Dimana setiap setter & getter method
    * akan dibuat menggunakan access modifier public.
    *
    * Format Penulisan Getter & Setter method:
    * 1. Getter method akan selalu di awali keyword getXXX
    *    kecuali untuk property boolean. Khusus untuk
    *    property boolean akan di awali dengan keyword isXXX.
    * 2. Setter method akan selalu di awali keyword setXXX
    * */
    private String name;
    private boolean married;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return this.married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
