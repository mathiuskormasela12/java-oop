package belajar.java.equals;

public class Main {
    public static void main(String[] args) {
        /*
        *
        * Equals Method
        *
        * Dalam Java operator double sama dengan (==) hanya
        * bisa digunakan pada tipe data primitif dan tidak bisa
        * digunakan untuk compare non-primitif tipe data atau object.
        * Oleh sebab itu ketika compare non-primitif tipe data kita
        * harus menggunakan equals method. Namun sebenarnya equeals method
        * memiliki prilaku default yg sma dengan operator double sma dengan (==)
        * yaitu mereka sama-sama akan membandingkan bukan value dari variable
        * tetai lokasi memory dari penyimpanan variable tersebut yg di komparasi.
        * Nah untuk ngesolve masalah itu, kita harus overrie equals method nya menggunakan
        * method overrieding. Namun jikalah kita hanya memandingkan string, kita tidak perlu
        * override equals method. namun lebih di rekomendasikan kita tetap mengoverride equals method.
        *
        * Namun kita kita membuat 2 buah varaible dgn value yg sama,
        * maka java akan hanya menyimpannya di satu memory saja. Dimana variable yg kedua
        * hanya akan mereferensikan memory nya. Jadi tidak akan di buat ulang; KLo di case seperti ini
        * double sama dengan akan works, jdi gk perlu pake equals method.
        *
        * Jika ingin compare exactyly object yg kita buat, kita harus menggunakan equals dan mengoverridenya.
        *
        * */
        String nama = "Mathius";
        nama += " ";
        nama += "Kormasela";
        String nama2 = "Mathius Kormasela";

        System.out.println(nama + " " + nama2);
        System.out.println(nama == nama2);
        System.out.println(nama.equals(nama2));

        var obj = new BelajarEqualsMethod();
        var obj2 = new BelajarEqualsMethod();

        System.out.println(obj.equals(obj2));
    }
}
