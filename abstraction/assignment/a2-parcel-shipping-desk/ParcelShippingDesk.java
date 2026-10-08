interface Insurable {
    double getInsurance();
}

abstract class Parcel {
    protected double weightKg;
    protected double declaredValue;

    public Parcel(double weightKg, double declaredValue) {
        this.weightKg = weightKg;
        this.declaredValue = declaredValue;
    }

    public abstract double getCharge();

    public abstract String getType();
}

class StandardParcel extends Parcel {
    public StandardParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    public double getCharge() {
        return 40 + 10 * weightKg;
    }

    public String getType() {
        return "STANDARD";
    }
}

class ExpressParcel extends Parcel implements Insurable {
    public ExpressParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    public double getCharge() {
        return 80 + 15 * weightKg;
    }

    public double getInsurance() {
        return 0.02 * declaredValue;
    }

    public String getType() {
        return "EXPRESS";
    }
}

class FragileParcel extends Parcel implements Insurable {
    public FragileParcel(double weightKg, double declaredValue) {
        super(weightKg, declaredValue);
    }

    public double getCharge() {
        return 40 + 10 * weightKg + 50;
    }

    public double getInsurance() {
        return 0.02 * declaredValue;
    }

    public String getType() {
        return "FRAGILE";
    }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Parcel[] parcels = new Parcel[3];
        parcels[0] = new StandardParcel(3, 500);
        parcels[1] = new ExpressParcel(2, 1000);
        parcels[2] = new FragileParcel(4, 2000);
        double grandTotal = 0;
        for (Parcel p : parcels) {
            double charge = p.getCharge();
            double insurance = 0;
            if (p instanceof Insurable) {
                insurance = ((Insurable) p).getInsurance();
            }
            double total = charge + insurance;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n", p.getType(), charge, insurance, total);
            grandTotal += total;
        }
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
