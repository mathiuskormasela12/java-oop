package belajar.java.oop;

public class BelajarSetterGetterAccessModifier {
    // Access Modifier (Public, Non-Modifier, Protected & Private)
    public String name = "Dapat di akses di manapun";
    protected String name2 = "Hanya dapat di akses di class, package dan child class yang sama. Kalau di luar itu tidak bisa";
    private String name3 = "Hanya dapat di akses di class yang sama";
    String name4 = "Hanya dapat di akses di class dan package yang sama";

    public static void main(String[] args) {
        var latihan = new SetterGetter();
        latihan.setName("Yerin");
        System.out.println(latihan.getName());
        System.out.println();
        latihan.setMarried(false);
        System.out.println("Menikah : " + (latihan.isMarried() ? "Sudah" : "Belum"));
    }
}
