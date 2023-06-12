package problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Please enter username.");
            String username = scanner.nextLine();
            File myFile = new File (username + ".txt");
            FileWriter myWriter = new FileWriter(username + ".txt");
            System.out.println("Please enter password.");
            myWriter.write(scanner.nextLine());
            myWriter.close();
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
