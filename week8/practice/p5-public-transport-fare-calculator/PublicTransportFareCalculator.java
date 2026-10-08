abstract class Transport {
    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double getFare();

    public abstract String getType();
}

class Bus extends Transport {
    public Bus(double distance) {
        super(distance);
    }

    public double getFare() {
        double fare = 2 + 0.10 * distance;
        if (fare > 10) {
            fare = 10;
        }
        return fare;
    }

    public String getType() {
        return "BUS";
    }
}

class Train extends Transport {
    public Train(double distance) {
        super(distance);
    }

    public double getFare() {
        return 3 + 0.15 * distance;
    }

    public String getType() {
        return "TRAIN";
    }
}

class Metro extends Transport {
    private double peakHourFactor;

    public Metro(double distance, double peakHourFactor) {
        super(distance);
        this.peakHourFactor = peakHourFactor;
    }

    public double getFare() {
        return (1.50 + 0.20 * distance) * peakHourFactor;
    }

    public String getType() {
        return "METRO";
    }
}

public class PublicTransportFareCalculator {
    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        transports[0] = new Bus(15);
        transports[1] = new Train(50);
        transports[2] = new Metro(10, 1.5);
        double total = 0;
        for (Transport t : transports) {
            double fare = t.getFare();
            System.out.printf("%s: %.2f%n", t.getType(), fare);
            total += fare;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
