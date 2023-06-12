import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textArr = scanner.nextLine().split(" ");
        StringBuilder modifiedSentence = new StringBuilder();


        for (String word : textArr) {
            String newWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            modifiedSentence.append(newWord + " ");
        }


        try {

            File myFile = new File("problem6Text.txt");
            FileWriter myWriter = new FileWriter(myFile);
            if (!myFile.isFile()) {

                myFile.createNewFile();
            } else {

                myWriter.write(String.valueOf(modifiedSentence));
            }

            myWriter.close();

        } catch (Exception e) {
            throw new RuntimeException("File not found");
        }

        System.out.println(modifiedSentence);
    }
}
