import java.util.Random;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(101);

        System.out.println("Enter a number.");
        boolean isGuessed = false;

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (number == input) {
                System.out.println("Congratulations, the number is " + number + ".");
                isGuessed = true;
                break;
            } else {
                if (number > input) {
                    System.out.println("No, the number is bigger.");
                } else {
                    System.out.println("No the number is smaller.");
                }
            }

            System.out.println("Enter a new number.");
        }

        if (!isGuessed) {
            System.out.println("You failed. The number");
        }
    }
}
