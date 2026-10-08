abstract class Connection {
    protected int units;

    public Connection(int units) {
        this.units = units;
    }

    public abstract double getBill();

    public abstract String getType();
}

class HomeConnection extends Connection {
    public HomeConnection(int units) {
        super(units);
    }

    public double getBill() {
        if (units <= 100) {
            return 5.0 * units;
        }
        return 5.0 * 100 + 7.0 * (units - 100);
    }

    public String getType() {
        return "HOME";
    }
}

class ShopConnection extends Connection {
    public ShopConnection(int units) {
        super(units);
    }

    public double getBill() {
        return 8.0 * units + 100;
    }

    public String getType() {
        return "SHOP";
    }
}

class FactoryConnection extends Connection {
    public FactoryConnection(int units) {
        super(units);
    }

    public double getBill() {
        double bill = 6.0 * units;
        if (bill < 1000) {
            bill = 1000;
        }
        return bill;
    }

    public String getType() {
        return "FACTORY";
    }
}

public class ElectricityConnectionBilling {
    public static void main(String[] args) {
        Connection[] connections = new Connection[3];
        connections[0] = new HomeConnection(150);
        connections[1] = new ShopConnection(90);
        connections[2] = new FactoryConnection(120);
        double total = 0;
        for (Connection c : connections) {
            double bill = c.getBill();
            System.out.printf("%s: %.2f%n", c.getType(), bill);
            total += bill;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
