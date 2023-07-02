package belajar.java.record;

public class Main {
    public static void main(String[] args) {
//        BelajarRecord rcrd = new BelajarRecord("Yerin", "Jung");
        BelajarRecord rcrd = new BelajarRecord("Yerin");
        System.out.println(rcrd);
        System.out.println(rcrd.firstName());
        System.out.println(rcrd.lastName());
    }
}
