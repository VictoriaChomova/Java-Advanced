package Problem2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] date1Input = Arrays.stream(scanner.nextLine().split("\\.")).mapToInt(Integer::parseInt).toArray();
        int[] date2Input = Arrays.stream(scanner.nextLine().split("\\.")).mapToInt(Integer::parseInt).toArray();

        LocalDate date1 = LocalDate.of(date1Input[2], date1Input[1], date1Input[0]);
        LocalDate date2 = LocalDate.of(date2Input[2], date2Input[1], date2Input[0]);
        Period period = Period.between(date1, date2);
        System.out.println(period.getYears() + " years");
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");
    }
}
