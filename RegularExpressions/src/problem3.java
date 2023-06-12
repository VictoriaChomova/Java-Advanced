import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem3 {
    public static void main(String[] args) {

        try {
            File newFile = new File("D:\\SirmaAcademy\\java-victoria-chomova\\java-victoria-chomova\\RegularExpressions\\src\\artists.txt");
            Scanner scanner = new Scanner(System.in);
            Scanner myReader = new Scanner(newFile);
            String name = scanner.nextLine();


            Pattern pattern = Pattern.compile(name);
            boolean isFound = false;
            while (myReader.hasNext()) {
                Matcher matcher = pattern.matcher(myReader.nextLine());
                if (matcher.find()) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                System.out.println("Artist is in catalogue");
            } else {
                System.out.println("Artist is not in catalogue");
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}

