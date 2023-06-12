package Problem1;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.of(2023, 01, 01);

        String[] input = scanner.nextLine().split("\\.");


        LocalDate dateInput = LocalDate.of(Integer.parseInt(input[2]), Integer.parseInt(input[1]), Integer.parseInt(input[0]));
        if (dateInput.getYear() < 2023) {
            System.out.println("The date must be in year 2023.");

        } else {
            Period period = Period.between(date, dateInput);
            System.out.println(period.getMonths() + " months");
            System.out.println(period.getDays() + " days");
        }
    }
}
