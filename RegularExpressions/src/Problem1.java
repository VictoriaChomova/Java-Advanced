import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        Pattern pattern = Pattern.compile("[\\d+\\w+\\W+]");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();

        if (matchFound && password.length() >= 8) {
            System.out.println("Password accepted!");
        } else {
            System.out.println("Invalid password");
        }

    }
}
