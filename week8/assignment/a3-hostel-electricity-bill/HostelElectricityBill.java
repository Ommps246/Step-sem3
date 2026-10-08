abstract class Room {
    protected int units;

    public Room(int units) {
        this.units = units;
    }

    public abstract double getBill();

    public abstract String getType();
}

class SingleRoom extends Room {
    public SingleRoom(int units) {
        super(units);
    }

    public double getBill() {
        return 8.0 * units;
    }

    public String getType() {
        return "SINGLE";
    }
}

class SharedRoom extends Room {
    private int occupants;

    public SharedRoom(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    public double getBill() {
        return (6.0 * units) / occupants;
    }

    public String getType() {
        return "SHARED";
    }
}

class AcRoom extends Room {
    public AcRoom(int units) {
        super(units);
    }

    public double getBill() {
        return 10.0 * units + 200;
    }

    public String getType() {
        return "AC";
    }
}

public class HostelElectricityBill {
    public static void main(String[] args) {
        Room[] rooms = new Room[3];
        rooms[0] = new SingleRoom(120);
        rooms[1] = new SharedRoom(150, 3);
        rooms[2] = new AcRoom(100);
        double total = 0;
        for (Room r : rooms) {
            double bill = r.getBill();
            System.out.printf("%s: %.2f%n", r.getType(), bill);
            total += bill;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
