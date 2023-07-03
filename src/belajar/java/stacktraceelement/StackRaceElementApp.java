package belajar.java.stacktraceelement;

public class StackRaceElementApp {

    /*
    *
    * =========== StackTraceElement ===========
    *
    * Dalam Throwable terdapat method getStackTrace
    * yang akan menghasilkan array berisi detail
    * mengenai error yg sedang terjadi. Detail error nya
    * bahkan akan berisi informasi class, file, method dan
    * baris kode yg terjadi error.
    *
    * getStackTrace method akan return error list dalam bentuk array StackTraceElement[].
    * Ada juga method printStackTrace yg akan secara otomatis akan print mengenai error yg terjadi.
    *
    * */
    public static void main(String[] args) {
        /*try {
            String[] names = new String[]{ "Yerin", "Sowon", "Eunha" };
            System.out.println(names[100]);
        } catch (Throwable exception) {
            // Akan berisi error dalam bentuk array StackTraceElement
            StackTraceElement[] stackTraceElements = exception.getStackTrace();

            for(var error : stackTraceElements) {
                System.out.println(error);
            }
        }*/

        sampleError();
    }

    public static void sampleError() {
        try {
            String[] names = new String[]{ "Yerin", "Sowon", "Eunha" };
            System.out.println(names[100]);
        } catch(Throwable exception) {
            // Akan secara otomatis print mengnai error yg terjadi
            exception.printStackTrace();
        }
    }
}
