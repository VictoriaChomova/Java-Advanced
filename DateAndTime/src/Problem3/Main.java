package Problem3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate date2 = date.plus(2, ChronoUnit.MONTHS);
        System.out.println(date2);

    }
}
