package project.CatHotel.src;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static final List<Bookable> bookings = new ArrayList<>();

    public static void addBooking(Bookable booking) {
        bookings.add(booking);
    }

    public static List<Bookable> getBookings() {
        return new ArrayList<>(bookings);
    }
}