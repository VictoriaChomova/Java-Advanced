import java.util.Random;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int tries = Integer.parseInt(scanner.nextLine());
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < tries; i++) {
            int x = random.nextInt(2);

            if (x == 0) {
                System.out.println("heads");
                heads++;
            } else {
                System.out.println("tails");
                tails++;
            }
        }
        double headsPerc = heads * 100.0/ tries ;
        double tailsPerc = tails * 100.0/ tries ;
        System.out.printf("Heads: %.2f%%", headsPerc);
        System.out.printf("Tails: %.2f%%", tailsPerc);
    }
}
