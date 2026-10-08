abstract class Vehicle {
    protected int hours;

    public Vehicle(int hours) {
        this.hours = hours;
    }

    public abstract double getCharge();

    public abstract String getType();
}

class Bike extends Vehicle {
    public Bike(int hours) {
        super(hours);
    }

    public double getCharge() {
        return 10.0 * hours;
    }

    public String getType() {
        return "BIKE";
    }
}

class Car extends Vehicle {
    public Car(int hours) {
        super(hours);
    }

    public double getCharge() {
        if (hours <= 1) {
            return 30.0;
        }
        return 30.0 + 20.0 * (hours - 1);
    }

    public String getType() {
        return "CAR";
    }
}

class Truck extends Vehicle {
    public Truck(int hours) {
        super(hours);
    }

    public double getCharge() {
        double charge = 50.0 * hours;
        if (charge < 100) {
            charge = 100;
        }
        return charge;
    }

    public String getType() {
        return "TRUCK";
    }
}

public class CampusParkingChargeCalculator {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Bike(3);
        vehicles[1] = new Car(4);
        vehicles[2] = new Truck(1);
        vehicles[3] = new Car(1);
        double total = 0;
        for (Vehicle v : vehicles) {
            double charge = v.getCharge();
            System.out.printf("%s: %.2f%n", v.getType(), charge);
            total += charge;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
