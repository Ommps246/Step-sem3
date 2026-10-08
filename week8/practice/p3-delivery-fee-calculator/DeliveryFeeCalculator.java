abstract class Delivery {
    protected double weight;
    protected double distance;

    public Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public abstract double getFee();

    public abstract String getType();
}

class StandardDelivery extends Delivery {
    public StandardDelivery(double weight, double distance) {
        super(weight, distance);
    }

    public double getFee() {
        return 5 + 0.50 * weight + 0.10 * distance;
    }

    public String getType() {
        return "STANDARD";
    }
}

class ExpressDelivery extends Delivery {
    public ExpressDelivery(double weight, double distance) {
        super(weight, distance);
    }

    public double getFee() {
        return 15 + 1.00 * weight + 0.20 * distance;
    }

    public String getType() {
        return "EXPRESS";
    }
}

class InternationalDelivery extends Delivery {
    private double customsFee;

    public InternationalDelivery(double weight, double distance, double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }

    public double getFee() {
        return 25 + 2.00 * weight + 0.50 * distance + customsFee;
    }

    public String getType() {
        return "INTERNATIONAL";
    }
}

public class DeliveryFeeCalculator {
    public static void main(String[] args) {
        Delivery[] deliveries = new Delivery[3];
        deliveries[0] = new StandardDelivery(10, 50);
        deliveries[1] = new ExpressDelivery(5, 20);
        deliveries[2] = new InternationalDelivery(20, 100, 30);
        double total = 0;
        for (Delivery d : deliveries) {
            double fee = d.getFee();
            System.out.printf("%s: %.2f%n", d.getType(), fee);
            total += fee;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
