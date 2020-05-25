package service;

import java.util.*;

public class AddBookingCinema {
    public static void addBookingCinema() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Ticket: ");
        int numberTicket = scanner.nextInt();
        System.out.printf("We have %d tickets!\n", numberTicket);
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int index = 0; index < numberTicket; index++) {
            System.out.printf("Enter name (%d): ", index + 1);
            String name = scanner.nextLine();
            queue.add(name);
        }
        System.out.println("All tickets had sold!");
        int counter = 1;
        while (!queue.isEmpty()) {
            System.out.println(counter + ". " + queue.pop());
            counter++;
        }
    }
}
