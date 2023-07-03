package belajar.java.reflection;

import java.lang.reflect.Field;

/*
*
* Ketika kita kombinasi reflection dengan annotation maka
* kita bisa melakukan validasi hanya dengan annotation. Jadi
* kyk bikin validation framework.
*
* Secara umum Reflection dapat kita gunakan untuk melihat struktur dari aplikasi kita saat berjalan
* */
public class Validation {
    public static void checkBody(Object obj) {
        // akses class nya
        Class aClass = obj.getClass();
        // tanpung semua field nya di dalam varaibel fiels
        Field[] fields = aClass.getDeclaredFields();

        for(Field field : fields) {
            // Set agar setiap property bisa di akses meskipun itu berupa private field
            field.setAccessible(true);

            // kalo property nya itu value nya gk null maka lakukan alidasi
            if(field.getAnnotation(NotBlank.class) != null) {
                try {
                    // ambil value dari field dan convert jdai srrint
                    String value = (String) field.get(obj);

                    if(value == null || value.isBlank()) {
                        throw new RuntimeException("Field " + field.getName() + " is not blank");
                    }
                } catch(IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
