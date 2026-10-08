abstract class Booking {
    protected double distanceKm;
    protected static final double BOOKING_FEE = 50;

    public Booking(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public abstract double getBaseFare();

    public double getTotal() {
        return getBaseFare() + BOOKING_FEE;
    }

    public abstract String getMode();
}

class BusBooking extends Booking {
    public BusBooking(double distanceKm) {
        super(distanceKm);
    }

    public double getBaseFare() {
        return 2.0 * distanceKm;
    }

    public String getMode() {
        return "BUS";
    }
}

class TrainBooking extends Booking {
    public TrainBooking(double distanceKm) {
        super(distanceKm);
    }

    public double getBaseFare() {
        return 1.5 * distanceKm;
    }

    public String getMode() {
        return "TRAIN";
    }
}

class FlightBooking extends Booking {
    public FlightBooking(double distanceKm) {
        super(distanceKm);
    }

    public double getBaseFare() {
        return 2500 + 4.0 * distanceKm;
    }

    public String getMode() {
        return "FLIGHT";
    }
}

public class TravelBookingWithACommonFee {
    public static void main(String[] args) {
        Booking[] bookings = new Booking[3];
        bookings[0] = new BusBooking(200);
        bookings[1] = new TrainBooking(300);
        bookings[2] = new FlightBooking(500);
        for (Booking b : bookings) {
            System.out.printf("%s: %.2f%n", b.getMode(), b.getTotal());
        }
    }
}
