package BinarySearchInBitonicArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] bitonicArr = new int[n];
        for(int i = 0; i < n; i++) {
            bitonicArr[i] = Integer.parseInt(scanner.nextLine());
        }
        int numberWanted = Integer.parseInt(scanner.nextLine());

        int indexWanted = BinarySearchInBitonicArray.search (bitonicArr, numberWanted);

        System.out.printf("Binary search in Bitonic Array(%d) = %d%n", numberWanted, indexWanted);
    }
}
