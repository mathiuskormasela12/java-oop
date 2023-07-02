package belajar.java.exception.checkedexception;

// Membuat Checked Exception
// Harus extedns class Throwable
// Basically, setiap exception ujung2 nya akan di extend ke Throwable class
// Karena parent class dari Exception itu adalah Throwable bukan nya class Object seperti class biasa
public class ValidationException extends Throwable{
    public ValidationException(String message) {
        super(message);
    }
}
