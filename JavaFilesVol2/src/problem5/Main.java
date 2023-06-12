package problem5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File newFile = new File("filenames.txt");
            newFile.createNewFile();

            FileWriter newFileWriter = new FileWriter("filenames.txt");
            newFileWriter.write("install\nnewFile\ninfo\nreadMe\nstart");
            newFileWriter.close();

            File newDir = new File("install");
            newDir.mkdir();

            Scanner myReader = new Scanner(newFile);
            while (myReader.hasNextLine()) {
               String fileName = myReader.nextLine();
               File newFile2 = new File("install/" + fileName + ".txt");
               newFile2.createNewFile();

            }

            myReader.close();

            long bytes = newDir.length();
            long mb = bytes / 1024;
            System.out.println(mb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
