package problem6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myDir = new File ("files");

            if (myDir.isDirectory()) {
                Scanner myReader = new Scanner(myDir);

                if(myReader.hasNext()){
                    String[] currentFile = myReader.next().split("\\.");
                    if (currentFile[1].equals("java")) {
                        System.out.println("Java fail found");
                        System.out.println("File name is" + currentFile[0]);
                    }

                }
                myReader.close();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
