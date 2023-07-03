package belajar.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

/*
*
* Annotation berfungsi untuk menambahkan metada.
* Kita bisa merasakan betapa powerfull nya Annotation ketika
* kita sudah menggunakna java Reflection.
*
* di Java ada beberapa contoh Predefine atau built-in Annotation, yaitu :
* 1. @Deprecated
*    Untuk memberi tanda bahwa suaatu bisa berupa class, method atau property itu
*    deprecated.
* 2. @Override
*    Untuk memberi tanda bahwa suatu method adalah sebuah
*    method overriding.
* 3. @FunctionalInterface
*    Untuk menandai bahwa sebuah class bisa di buat sbg lambda expression
* */

/*
* Untuk menentukan dimana saja
* annotatoion tersebut boleh disisipkan.
*
* TYPE => boleh di sisiplan pada class, interface,
*         annotation, enum dan juga record.
* FIELD => boleh disisipkan di property dan juga enum constant
* METHOD => boleh disisipkan pada method
* PARAMETER => boleh disisipkan pada paremeter
* CONSTURCTOR => boleh disisipkan pada constructor
*
* dan masih banuak lgi
*
* */
@Target(value={ElementType.TYPE, ElementType.METHOD})
/*
* Menentukan apakah annotation nya akan
* di masukan di dalam hasil compile java atau akan di discard.
*
* SOURCE => akan di exclude dari hasil compile
* CLASS (ini default value) => akan di include di hasil compile pada class file,
*           tapi tidak akan di include oleh VM saat run time.
* RUNTIME => akan di include di hasil compile
*            dan saat runtime oleh VM akan tetap di include
* */
@Retention(value=RetentionPolicy.RUNTIME)
public @interface BelajarAnnotation {
    String firstName();
    String lastName() default "";

    String[] skills() default {};
}
