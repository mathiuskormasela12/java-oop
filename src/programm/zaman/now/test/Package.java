// Ketika membuat class di dalam package
// kita hrus menuliskan nama package nya dulu di line 1.
// ini wajib, klo gk di tulis atau typo maka Java nya akan error
package programm.zaman.now.test;

public class Package {
    public static void main(String[] args) {
        // Package merupakan bisa di bilang
        // sebagai folder merupakan cara untuk mengelompokan
        // class. Package pun memungkinkan kita untuk membuat nested package
        // munggunakan tanda titik. contoh misal kita akan
        // membuat package bernama app lalu di dlm nya ada package test
        // maka bisa kita tulis seperti ini app.test
        System.out.println("Java Package");
    }
}
