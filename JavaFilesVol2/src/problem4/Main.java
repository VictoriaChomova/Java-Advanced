package problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        try {
            System.out.println(1/Math.sin(x));
        } catch (Exception e) {
            System.out.println("This value of the argument is not valid");
            e.printStackTrace();
        }
    }
}
