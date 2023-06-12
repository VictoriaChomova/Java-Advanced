import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\.");

        for (int i = 0; i < input.length; i++)  {
            Pattern pattern = Pattern.compile("^0+");
            Matcher matcher = pattern.matcher(input[i]);
            boolean matchFound = matcher.find();

            if (matchFound) {
                String replaceString = input[i].replaceFirst("0+", "");
                input[i] = replaceString;
            }

        }

        System.out.printf(String.join(".", input));
    }
}
