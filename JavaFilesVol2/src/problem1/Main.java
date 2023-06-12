package problem1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File newDir = new File("config");
            if(newDir.isDirectory()) {
                System.out.println("The directory already exists.");
            }else {
                newDir.mkdir();
            }

            File newFile = new File("config/configure.txt");
            newFile.createNewFile();
            newFile = new File("config/settings.txt");
            newFile.createNewFile();


            newDir = new File("info");
            if(newDir.isDirectory()) {
                System.out.println("The directory already exists.");
            }else {
                newDir.mkdir();
            }

            newFile = new File("info/readme.txt");
            newFile.createNewFile();
            newFile = new File("info/copyright.txt");
            newFile.createNewFile();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
