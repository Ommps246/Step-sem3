abstract class Ticket {
    protected int count;
    protected static final double CONVENIENCE_FEE = 20;

    public Ticket(int count) {
        this.count = count;
    }

    public abstract double getPrice();

    public double getAmount() {
        return (getPrice() + CONVENIENCE_FEE) * count;
    }

    public abstract String getSeatType();
}

class RegularTicket extends Ticket {
    public RegularTicket(int count) {
        super(count);
    }

    public double getPrice() {
        return 150;
    }

    public String getSeatType() {
        return "REGULAR";
    }
}

class PremiumTicket extends Ticket {
    public PremiumTicket(int count) {
        super(count);
    }

    public double getPrice() {
        return 250;
    }

    public String getSeatType() {
        return "PREMIUM";
    }
}

class ReclinerTicket extends Ticket {
    public ReclinerTicket(int count) {
        super(count);
    }

    public double getPrice() {
        return 400;
    }

    public String getSeatType() {
        return "RECLINER";
    }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[3];
        tickets[0] = new RegularTicket(3);
        tickets[1] = new PremiumTicket(2);
        tickets[2] = new ReclinerTicket(1);
        double total = 0;
        for (Ticket t : tickets) {
            double amount = t.getAmount();
            System.out.printf("%s: %.2f%n", t.getSeatType(), amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
