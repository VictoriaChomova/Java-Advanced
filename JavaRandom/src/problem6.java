import java.util.Random;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {

        Random random = new Random();

        int size = 200;

        double[] normal = new double[size];
        double[] diffs = new double[size];

        double sum = 0, sum2 = 0;

        for (int i = 0; i < size; i++) {
            normal[i] = random.nextGaussian();
            sum += normal[i];
        }
        double avg = sum / size;

        for (int i = 0; i < size; i++) {

            diffs[i] = Math.abs(normal[i] - avg);
            sum2 += diffs[i];
        }

        double variation = sum2 / size;

        double std = Math.sqrt(variation);
        System.out.println("This is normal distribution with mean " + avg + ", variation " + variation + " and standard deviation " + std);
    }
}
