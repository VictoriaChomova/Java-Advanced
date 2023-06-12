package Problem6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        LocalDate previousLeapYear = LocalDate.now();
        LocalDate nextLeapYear = LocalDate.now();
        do {
            if (!previousLeapYear.isLeapYear()) {
                previousLeapYear = previousLeapYear.minus(1, ChronoUnit.YEARS);
            }
        } while (!previousLeapYear.isLeapYear());

        nextLeapYear = previousLeapYear.plus(4, ChronoUnit.YEARS);

        System.out.println("The previous leap year is " + previousLeapYear.getYear() + "." );
        System.out.println("The next leap year is " + nextLeapYear.getYear() + ".");
    }
}
