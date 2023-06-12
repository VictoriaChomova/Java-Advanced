package problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> employeeNames = new ArrayList<>();
        List<String> employeeEGN = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            employeeNames.add(scanner.nextLine());
            employeeEGN.add(scanner.nextLine());
        }
        try {
            File newFile = new File("names.txt");
            newFile.createNewFile();

            newFile = new File("EGN.txt");
            newFile.createNewFile();

            FileWriter newFileWriter = new FileWriter("names.txt");

            for (int i = 0; i < 10; i++) {
                newFileWriter.write(employeeNames.get(i));
                newFileWriter.write("\n");
            }

            newFileWriter.close();
            newFileWriter = new FileWriter("EGN.txt");
            for (int i = 0; i < 10; i++) {
                newFileWriter.write(employeeEGN.get(i));
                newFileWriter.write("\n");
            }
            newFileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
