package belajar.java.exception.checkedexception;

import belajar.java.exception.data.Mahasiswa;

public class BelajarCheckedException {
    /*
    *
    * Belajar Exception
    *
    * Dalam Java ada yang nama nya exception. Exception adalah
    * class-class dalam Java yang berguna untuk mendefinisikan error.
    *
    * Dalam Java terdapat 3 jenis exception
    * 1. Checked Exception
    *    Exception jenis ini wajib di tulis menggunakan
    *    try & catch, kalau tidak maka akan error dan aplikasi kita
    *    akan mati.
    * 2. Runtime Exception
    *    Exception jenis ini tidak wajib di tulis menggunakan
    *    block try catch. Namun di rekomendasikna untuk tetap pake try catch.
    * 3. Error Exception
    *    Exception jenis ini tidak boleh di tulis dalam block try catch walaupun
    *    sebenarnya bisa. Tapi sebaiknya exception jenis ini tidak boleh ada try catch nua
    *    karena exception jenis ini di expect untuk membuat aplikasi kita mati jika
    *    terjadi error. Exception jenis ini di rekomendasikan di gunakan untuk
    *    jenis error yg crucial, contoh misal error gagal database. Dimana klo ada error database
    *   bagus nya aplikasi kita harus di matikan.
    *
    * */
    // Untuk Checkedn Exception harus memiliki keyword throws ClassCheckedExceptionnya, ClassCheckedExceptionnya
    // throws 1 CheckedException
    public static void validateData(Mahasiswa mhs) throws ValidationException{
        if(mhs.studentName() == null) {
            throw new ValidationException("Student name is null");
        } else if(mhs.studentName().isBlank()) {
            throw new ValidationException("Student name can't be empty");
        } else if(mhs.major() == null) {
            throw new ValidationException("Major is null");
        } else if(mhs.major().isBlank()) {
            throw new ValidationException("Major can't be empty");
        }
    }

    // throws multiple checked exception
    public static void validateDataMulti(Mahasiswa mhs) throws ValidationException, NullPointerException {
        if(mhs.studentName() == null) {
            throw new NullPointerException("Student name is null");
        } else if(mhs.studentName().isBlank()) {
            throw new ValidationException("Student name can't be empty");
        } else if(mhs.major() == null) {
            throw new NullPointerException("Major is null");
        } else if(mhs.major().isBlank()) {
            throw new ValidationException("Major can't be empty");
        }
    }
}
