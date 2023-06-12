package Problem8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start and end dates in the following format: dd/MM/yyyy");
        int[] startDate = Arrays.stream(scanner.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
        int[] endDate = Arrays.stream(scanner.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();


        LocalDate date1 = LocalDate.of(startDate[2], startDate[1], startDate[0]);
        LocalDate date2 = LocalDate.of(endDate[2], endDate[1], endDate[0]);
        int counter = 0;

        do {
            if (date1.isLeapYear()) {

                counter++;
            }

            date1 = date1.plus(1, ChronoUnit.YEARS);

        } while (!date1.equals(date2));

        if (date2.isLeapYear()) {
            counter++;
        }

        System.out.println("There are " + counter + " leap years in between.");

    }
}
