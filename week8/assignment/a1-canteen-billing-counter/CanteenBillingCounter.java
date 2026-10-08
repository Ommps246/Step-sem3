abstract class Customer {
    protected double amount;

    public Customer(double amount) {
        this.amount = amount;
    }

    public abstract double getFinalAmount();

    public abstract String getType();
}

class Student extends Customer {
    public Student(double amount) {
        super(amount);
    }

    public double getFinalAmount() {
        return amount * 0.90;
    }

    public String getType() {
        return "STUDENT";
    }
}

class Staff extends Customer {
    public Staff(double amount) {
        super(amount);
    }

    public double getFinalAmount() {
        return amount * 0.95;
    }

    public String getType() {
        return "STAFF";
    }
}

class Guest extends Customer {
    public Guest(double amount) {
        super(amount);
    }

    public double getFinalAmount() {
        return amount + 10;
    }

    public String getType() {
        return "GUEST";
    }
}

public class CanteenBillingCounter {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Student(200);
        customers[1] = new Staff(300);
        customers[2] = new Guest(150);
        double total = 0;
        for (Customer c : customers) {
            double finalAmount = c.getFinalAmount();
            System.out.printf("%s: %.2f%n", c.getType(), finalAmount);
            total += finalAmount;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
