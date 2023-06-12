package Problem5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many pizzas would you like to order?");
        int pizzaCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter how many drinks would you like to order?");
        int drinksCount = Integer.parseInt(scanner.nextLine());

        double pizzaPrice = pizzaCount * 1.8;
        double drinksPrice = drinksCount * 1.5;
        double totalPrice = pizzaPrice + drinksPrice;


        LocalDateTime timeOfOrder = LocalDateTime.now();
        LocalDateTime timeOfDelivery = timeOfOrder.plus(2, ChronoUnit.HOURS);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedHour = timeOfDelivery.format(formatter);
        System.out.printf("Total price is: %.2f%n",totalPrice);
        System.out.println("Delivery expected on " + formattedHour + "h.");

    }
}
