package belajar.java.exception.checkedexception;

import belajar.java.exception.data.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("", "Dances");

        System.out.println("============ Single Checked Exception ============");
        try {
            BelajarCheckedException.validateData(mhs);
            System.out.println("Sukses");
        } catch(ValidationException error) {
            System.out.println("Ada Error : " + error.getMessage());
        }
        System.out.println("==================================================");
        System.out.println("");

        System.out.println("============ Multiple Checked Exception ============");
        try {
            BelajarCheckedException.validateData(mhs);
            System.out.println("Sukses");
        } catch(ValidationException | NullPointerException error) {
            System.out.println("Hmmm error : " + error.getMessage());
        }

        // atau
        try {
            BelajarCheckedException.validateData(mhs);
            System.out.println("Sukses");
        } catch(ValidationException error) {
            System.out.println("Hmmm error validasi : " + error.getMessage());
        } catch(NullPointerException error) {
            System.out.println("Hmmm error null : " + error.getMessage());
        } finally {
            System.out.println("Jalankan Finally setelah setiap resolved/error action");
        }
        System.out.println("==================================================");
    }
}
