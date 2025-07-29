package lab4.ui;

import lab4.model.BookingModel;
import lab4.repository.BookingRepository;
import lab4.util.MainMenuUtil;
import lab4.util.MenuUtil;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookingRepository repo = new BookingRepository();
        int choice;

        do {
            choice = MainMenuUtil.displayMainMenu();

            switch (choice) {
                case 1:
                    BookingModel model = MenuUtil.bookFlights();
                    repo.addBooking(model);
                    break;
                case 2:
                    repo.displayBookings();
                    break;
                case 3:
                    System.out.print("Enter Booking ID to search: ");
                    int idSearch = sc.nextInt();
                    repo.searchBooking(idSearch);
                    break;
                case 4:
                    System.out.print("Enter Booking ID to update: ");
                    int idUpdate = sc.nextInt(); sc.nextLine();
                    BookingModel updatedModel = MenuUtil.bookFlights();
                    repo.updateBooking(idUpdate, updatedModel);
                    break;
                case 5:
                    System.out.print("Enter Booking ID to delete: ");
                    int idDelete = sc.nextInt();
                    repo.deleteBooking(idDelete);
                    break;
                case 6:
                    System.out.println("Exiting app...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
