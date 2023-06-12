package problem3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("info.txt");

            if (!myFile.isFile()) {
                myFile.createNewFile();

            }

            FileWriter myWriter = new FileWriter("info.txt");

            for (int i = 1; i <= 100; i++) {
                if (i == 100) {
                    myWriter.write(i + "");
                } else {
                    myWriter.write(i + ", ");
                }

            }

            myWriter.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
