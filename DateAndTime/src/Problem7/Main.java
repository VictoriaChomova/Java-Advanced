package Problem7;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three dates in the following format: dd/MM/yyyy");
        int[] firstDate = Arrays.stream(scanner.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
        int[] secondDate = Arrays.stream(scanner.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
        int[] thirdDate = Arrays.stream(scanner.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();

        LocalDate date1 = LocalDate.of(firstDate[2], firstDate[1], firstDate[0]);
        LocalDate date2 = LocalDate.of(secondDate[2], secondDate[1], secondDate[0]);
        LocalDate date3 = LocalDate.of(thirdDate[2], thirdDate[1], thirdDate[0]);

        List<LocalDate> dates = new ArrayList<>();

        dates.add(date1);
        dates.add(date2);
        dates.add(date3);

        Collections.sort(dates);

        for (LocalDate date: dates) {
            System.out.println(date);
        }



    }
}
