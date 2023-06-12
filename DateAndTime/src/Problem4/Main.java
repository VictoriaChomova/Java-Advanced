package Problem4;



import java.time.LocalTime;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        LocalTime currentTime = LocalTime.of(hour, minutes);

        LocalTime midnight = LocalTime.of(00, 00);

        System.out.println(Math.abs(currentTime.until(midnight, ChronoUnit.HOURS)) + " hours " + Math.abs(currentTime.until(midnight, ChronoUnit.MINUTES)) + " minutes left.");

    }
}
