package lab4.util;

import lab4.model.BookingModel;
import java.util.Scanner;

public class MenuUtil {
    static Scanner sc = new Scanner(System.in);

    public static BookingModel bookFlights() {
        System.out.print("Enter Booking Id: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Source: ");
        String source = sc.nextLine();
        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();
        System.out.print("Enter Ticket Class: ");
        String ticketClass = sc.nextLine();
        System.out.print("Enter No. of Passengers: ");
        int passengers = sc.nextInt();
        System.out.print("Is it Round Trip? (true/false): ");
        boolean roundTrip = sc.nextBoolean();

        return new BookingModel(id, source, destination, ticketClass, passengers, roundTrip);
    }
}
