package problem5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();

        try {
            File myFile = new File("int_data.txt");
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNext()) {
                numbersList.add(2 * Integer.parseInt(myReader.nextLine()));

            }
            myReader.close();
            FileWriter myWriter = new FileWriter("doubled_ints.txt");
            for (int number : numbersList) {
                myWriter.write(number);
            }

            myWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
