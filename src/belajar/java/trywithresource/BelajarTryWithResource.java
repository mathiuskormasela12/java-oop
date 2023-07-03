package belajar.java.trywithresource;

public class BelajarTryWithResource {
    public static void main(String[] args) {
        /*
        *
        * ========== Try-Catch with Resource ==========
        *
        * Try-catch with resource merupakan jenis try-catch yg akan
        * secara otomatis melakukan close resource. Jika ingin menggunakan
        * fitur ini kita wajib menggunakan interface AutoCloseable. Try-Catch jenis
        * ini merupakan fitur baru dalam jaav 7 bernama try with resource.
        *
        * */

        //WithTryCatchResource.denganTryCatchResource();
        WithTryCatchResource.tanpaTryWithResource();
    }
}
