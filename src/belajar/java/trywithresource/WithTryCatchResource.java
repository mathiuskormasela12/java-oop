package belajar.java.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithTryCatchResource {

    public static void tanpaTryWithResource() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new FileReader("README.md")
            );

            while(true) {
                String line = reader.readLine();

                if(line == null) {
                    break;
                }

                System.out.println(line);
            }
        } catch(Throwable error) {
            System.out.println("Error membaca file : " + error.getMessage());
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                    System.out.println("Sukses menutup");
                } catch(IOException error) {
                    System.out.println("Error menutup resource : " + error.getMessage());
                }
            }
        }
    }

    public static void denganTryCatchResource() {
        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while(true) {
                String line = reader.readLine();

                if(line == null) {
                    break;
                }

                System.out.println(line);
            }
        } catch(Throwable error) {
            error.printStackTrace();
        }
    }
}
