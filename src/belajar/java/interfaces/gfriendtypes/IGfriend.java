package belajar.java.interfaces.gfriendtypes;

import belajar.java.interfaces.gfriendtypes.IGirlGroup;

/* Dalam Java, interface hanya boleh
   berisi method dan juga final (konstanta) property.
   Kode di bawah membuat interface sekaligus mengextend nya dengan
   interface lain.

    Catatan, interface dan class dapat mengimplementasi
    lebih dari satu interface. Tapi class hanya bisa implementadsi
    satu class.
 */
public interface IGfriend extends IGirlGroup{
    // Gk perlu define access modifier
    // karena by default akan di set menjadi public
    void sayHello();
    final String fullName = "Gfriend";

    // Membuat default method
    // method di bawah tidak wajib
    // di buat implementasi di class utamanya
    default void jalan() {
        System.out.println("JALAN");
    }
}
