import java.util.Random;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        String number = "";

        boolean isGuessed = false;
        for (int i = 0; i < 4; i++) {
            char current = (char) (random.nextInt(48, 58));
            number += current;
        }

        for (int i = 1; i <= 10; i++) {
            int cows = 0;
            int bulls = 0;
            System.out.println("Try " + i);

            String input = scanner.nextLine();
            if (number.equals(input)) {
                System.out.println("Congratulations you guessed!");
                isGuessed = true;
                break;
            }
            for (int j = 0; j < 4; j++) {

                char next = input.charAt(j);
                if (number.contains(String.valueOf(next))) {
                    if (number.charAt(j) == next) {
                        bulls += 1;
                    } else {
                        cows += 1;
                    }
                }
            }

            System.out.println(bulls + " bulls, " + cows + "cows");
        }

        if (!isGuessed) {
            System.out.println("Sorry, you are out of tries! The number was " + number + ".");
        }
    }
}
