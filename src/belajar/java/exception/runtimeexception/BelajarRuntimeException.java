package belajar.java.exception.runtimeexception;

// Runtime Exception harus di extend dari RuntimeException class
public class BelajarRuntimeException extends RuntimeException{
    public BelajarRuntimeException(String msg) {
        super(msg);
    }
}
