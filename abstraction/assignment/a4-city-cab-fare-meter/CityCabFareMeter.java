interface NightCapable {
}

abstract class Cab {
    protected double km;
    protected String time;

    public Cab(double km, String time) {
        this.km = km;
        this.time = time;
    }

    public abstract double getRate();

    public abstract String getType();

    public double getFare() {
        double fare = getRate() * km;
        if (fare < 100) {
            fare = 100;
        }
        if (time.equals("NIGHT")) {
            fare = fare * 1.2;
        }
        return fare;
    }

    public boolean isRejected() {
        return time.equals("NIGHT") && !(this instanceof NightCapable);
    }
}

class Mini extends Cab {
    public Mini(double km, String time) {
        super(km, time);
    }

    public double getRate() {
        return 10;
    }

    public String getType() {
        return "MINI";
    }
}

class Sedan extends Cab implements NightCapable {
    public Sedan(double km, String time) {
        super(km, time);
    }

    public double getRate() {
        return 14;
    }

    public String getType() {
        return "SEDAN";
    }
}

class Suv extends Cab implements NightCapable {
    public Suv(double km, String time) {
        super(km, time);
    }

    public double getRate() {
        return 18;
    }

    public String getType() {
        return "SUV";
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Cab[] cabs = new Cab[4];
        cabs[0] = new Mini(8, "DAY");
        cabs[1] = new Sedan(10, "NIGHT");
        cabs[2] = new Suv(20, "DAY");
        cabs[3] = new Mini(5, "NIGHT");
        double total = 0;
        for (Cab c : cabs) {
            if (c.isRejected()) {
                System.out.println(c.getType() + ": night service not available");
            } else {
                double fare = c.getFare();
                System.out.printf("%s: %.2f%n", c.getType(), fare);
                total += fare;
            }
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
