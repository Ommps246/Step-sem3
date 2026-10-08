interface SaverCapable {
    double getSaverUnits(double units);
}

abstract class Appliance {
    protected double hours;
    protected boolean saverRequested;

    public Appliance(double hours, boolean saverRequested) {
        this.hours = hours;
        this.saverRequested = saverRequested;
    }

    public abstract double getPowerWatts();

    public abstract String getType();

    public double getUnits() {
        double units = getPowerWatts() * hours / 1000.0;
        if (saverRequested && this instanceof SaverCapable) {
            units = ((SaverCapable) this).getSaverUnits(units);
        }
        return units;
    }

    public double getCost() {
        return getUnits() * 8;
    }

    public boolean isSaverUnsupported() {
        return saverRequested && !(this instanceof SaverCapable);
    }
}

class Fridge extends Appliance {
    public Fridge(double hours, boolean saverRequested) {
        super(hours, saverRequested);
    }

    public double getPowerWatts() {
        return 150;
    }

    public String getType() {
        return "FRIDGE";
    }
}

class Ac extends Appliance implements SaverCapable {
    public Ac(double hours, boolean saverRequested) {
        super(hours, saverRequested);
    }

    public double getPowerWatts() {
        return 1500;
    }

    public String getType() {
        return "AC";
    }

    public double getSaverUnits(double units) {
        return units * 0.75;
    }
}

class Tv extends Appliance {
    public Tv(double hours, boolean saverRequested) {
        super(hours, saverRequested);
    }

    public double getPowerWatts() {
        return 100;
    }

    public String getType() {
        return "TV";
    }
}

class Washer extends Appliance implements SaverCapable {
    public Washer(double hours, boolean saverRequested) {
        super(hours, saverRequested);
    }

    public double getPowerWatts() {
        return 500;
    }

    public String getType() {
        return "WASHER";
    }

    public double getSaverUnits(double units) {
        return units * 0.75;
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[4];
        appliances[0] = new Fridge(24, false);
        appliances[1] = new Ac(8, true);
        appliances[2] = new Tv(5, false);
        appliances[3] = new Washer(2, true);
        double total = 0;
        for (Appliance a : appliances) {
            if (a.isSaverUnsupported()) {
                System.out.println(a.getType() + ": saver mode not supported");
            } else {
                double units = a.getUnits();
                double cost = a.getCost();
                System.out.printf("%s: Units=%.2f Cost=%.2f%n", a.getType(), units, cost);
                total += cost;
            }
        }
        System.out.printf("Total Cost: %.2f%n", total);
    }
}
