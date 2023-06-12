package problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            File myFile = new File("filename.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Please enter your text!");
            String input = scanner.nextLine();
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(input);
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
