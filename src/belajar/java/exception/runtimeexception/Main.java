package belajar.java.exception.runtimeexception;

import belajar.java.exception.checkedexception.ValidationException;
import belajar.java.exception.data.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        try {
            Validation.validate(new Mahasiswa("Mathius", "Korl"));
            System.out.println("Sukses");
        } catch(BelajarRuntimeException | NullPointerException error) {
            System.out.println("Error : " + error.getMessage());
        }
    }
}
