package belajar.java.enums;

public class Main {
    public static void main(String[] args) {
        BelajarEnum test = new BelajarEnum();
        test.setGfriend(EnumData.EUNHA);
        System.out.println(test.getGfriend());

        // Konversi enum jdi string
        String myName = EnumData.EUNHA.name();
        System.out.println(myName);

        // Konversi String ke enum
        EnumData myNameEnum = EnumData.valueOf(myName);
        System.out.println(myNameEnum);

        // Menampilkan list enum
        /*for(var item : test.getGfriend().values()) {
            System.out.println(item);
        }*/

        System.out.println(test.getGfriend().name);

    }
}
