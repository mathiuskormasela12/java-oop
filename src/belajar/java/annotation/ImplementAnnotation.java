package belajar.java.annotation;

@BelajarAnnotation(firstName = "Mathius", lastName = "Kormasela", skills = {"Javascript", "Typescript"})
public class ImplementAnnotation {

    @BelajarAnnotation(firstName="Yerin")
    public void start() {
        System.out.println("Hello Annotation");
    }
}
