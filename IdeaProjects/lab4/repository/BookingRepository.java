package lab4.repository;

import lab4.model.BookingModel;

import java.util.*;

public class BookingRepository {
    private Map<Integer, BookingModel> bookingMap = new HashMap<>();

    public void addBooking(BookingModel model) {
        if (bookingMap.containsKey(model.getBookingId())) {
            System.out.println("Booking already exists with ID: " + model.getBookingId());
        } else {
            bookingMap.put(model.getBookingId(), model);
            System.out.println("Booking saved: " + model);
        }
    }

    public void displayBookings() {
        if (bookingMap.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            bookingMap.values().forEach(System.out::println);
        }
    }

    public void searchBooking(int id) {
        if (bookingMap.containsKey(id)) {
            System.out.println("Booking found: " + bookingMap.get(id));
        } else {
            System.out.println("No booking found with ID: " + id);
        }
    }

    public void updateBooking(int id, BookingModel updatedBooking) {
        if (bookingMap.containsKey(id)) {
            bookingMap.put(id, updatedBooking);
            System.out.println("Booking updated.");
        } else {
            System.out.println("Booking ID not found.");
        }
    }

    public void deleteBooking(int id) {
        if (bookingMap.containsKey(id)) {
            bookingMap.remove(id);
            System.out.println("Booking deleted.");
        } else {
            System.out.println("Booking ID not found.");
        }
    }
}
