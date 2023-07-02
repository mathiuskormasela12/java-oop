package belajar.java.exception.runtimeexception;

import belajar.java.exception.data.Mahasiswa;

// Gk wajib tulis throws ExceptionClass nya
public class Validation {
    public static void validate(Mahasiswa mhs) {
        if(mhs.studentName() == null) {
            throw new NullPointerException("Student name can't be null");
        } else if (mhs.studentName().isBlank()) {
            throw new BelajarRuntimeException("Student name can't be empty");
        } else if(mhs.major() == null) {
            throw new NullPointerException("Major can't be null");
        } else if(mhs.major().isBlank()) {
            throw new BelajarRuntimeException("Major can't be empty");
        }
    }
}
