import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine().replaceAll("[^\\d.]", "");


        System.out.println(number);

        Pattern bits = Pattern.compile("[^0,1]");
        Matcher matcher = bits.matcher(number);
        if (matcher.find()) {
            System.out.println("Number is not binary");
        } else {
            System.out.println("Number is binary");
        }
    }
}
