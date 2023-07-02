package belajar.java.exception.error;

import belajar.java.exception.checkedexception.ValidationException;
import belajar.java.exception.data.Mahasiswa;

public class ValidExep {
    public static void validate(Mahasiswa mhs) {
        if(mhs.studentName() == null) {
            throw new NullPointerException("Student name is null");
        } else if(mhs.studentName().isBlank()) {
            throw new ErrorException("Student name can't be empty");
        } else if(mhs.major() == null) {
            throw new NullPointerException("Major is null");
        } else if(mhs.major().isBlank()) {
            throw new ErrorException("Major can't be empty");
        }
    }
}
