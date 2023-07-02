package belajar.java.exception.error;

import belajar.java.exception.data.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        // Untuk error exception tidak boleh pake try catch block
        // karena di expect jenis error ini buat erorr yg crucial
        // dimana klo error nya terjadi maka aplikasi kita harus di matikan
        ValidExep.validate(new Mahasiswa("Dea", "Affrizal"));
        System.out.println("Sukses");
    }
}
