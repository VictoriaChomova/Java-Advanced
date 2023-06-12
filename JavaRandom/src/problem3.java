import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        int credit = 10;
        Random random = new Random();

        while (credit > 0) {
            credit--;
            int a = random.nextInt(11);
            int b = random.nextInt(11);
            int c = random.nextInt(11);
            System.out.println(a + ", " + b + ", " + c);
            if (a == b && b == c) {
                System.out.println("Congratulations, you have 3 out of 3 matches! 10 points added to your credit!");
                credit += 10;
            } else if (a == b || b == c || a == c) {
                System.out.println("Congratulations, you have 2 out of 3 matches! 5 points added to your credit!");
                credit += 5;
            }
            System.out.println("Your credit: " + credit);
            System.out.println("Spin again?");
            String action = scanner.nextLine();

            if (action.equals("no")) {
                break;
            }
        }
        if (credit <= 0) {
            System.out.println("Out of credit!");
        } else {
            System.out.printf("You have %d credit left", credit);
        }
        //директно генериране на случайни числа в лист;
        //List<Integer> ints = random.ints(3, 0, 11).collect(ArrayList::new, List::add, List::addAll);;
    }
}
