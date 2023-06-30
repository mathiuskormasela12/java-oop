package belajar.java.hashcode;

public class Main {
    public static void main(String[] args) {
        var satu = new BelajarHashCode();
        satu.setName("Yerin");
        var dua = new BelajarHashCode();

        /*
        *
        * Hash Code
        * Hashcode merupakan representasi integer object
        * (mirip seperti toString method pada String object).
        * Sangat berguna untuk membuat struktur data unique seperti
        * HashMap, Set dll. Karena dengan hashCod kita bisa mendapatkan unique
        * identity dari object kita. By default hashCode akan return nilai
        * integer sesuai data di memory, namun better di override.
        *
        * */

        System.out.println(satu.equals(dua));
        System.out.println(satu.hashCode() == dua.hashCode());
    }
}
