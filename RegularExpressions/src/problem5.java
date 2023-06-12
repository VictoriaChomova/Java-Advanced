import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("[\\s+\\W+\\d+]", "");
        int vowelsCounter = 0;
        int consonantsCounter = 0;
        Pattern pattern = Pattern.compile("[aoeui]");
        Matcher matcher = pattern.matcher(input);

        for (int i = 0; i < input.length(); i++) {

            if (matcher.find()) {
                vowelsCounter++;
            } else {
                consonantsCounter++;
            }
        }

        System.out.println("Vowels: " + vowelsCounter);
        System.out.println("Consonants: " + consonantsCounter);
    }
}
