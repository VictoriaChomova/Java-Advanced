import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[\\W+|\\d+]");
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Correct input!");
        }
    }
}
