package SumNumbersInArrInTwoThreads;

public class SumNumbersInArr {



    public static void sum(int[] numbersArr, int thread) {
        int sum = 0;
        if (thread == 1) {
            for (int i = 0; i < 3; i++) {
                sum += numbersArr[i];
            }
        } else if (thread == 2) {
            for (int i = 3; i < 6; i++) {
                sum += numbersArr[i];
            }
        } else if (thread == 3) {
            for (int i = 6; i < 9; i++) {
                sum += numbersArr[i];
            }
        }
        System.out.println ("Sum " + thread + ": " + sum);
    }
}
