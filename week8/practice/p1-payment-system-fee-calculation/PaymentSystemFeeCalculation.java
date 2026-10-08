abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract double getAdjustedAmount();

    public abstract String getType();
}

class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    public double getAdjustedAmount() {
        return amount * 1.02;
    }

    public String getType() {
        return "CARD";
    }
}

class WalletPayment extends Payment {
    public WalletPayment(double amount) {
        super(amount);
    }

    public double getAdjustedAmount() {
        return amount * 1.01;
    }

    public String getType() {
        return "WALLET";
    }
}

class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    public double getAdjustedAmount() {
        return amount;
    }

    public String getType() {
        return "BANKTRANSFER";
    }
}

public class PaymentSystemFeeCalculation {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        payments[0] = new CardPayment(1000);
        payments[1] = new WalletPayment(500);
        payments[2] = new BankTransferPayment(2000);
        double total = 0;
        for (Payment p : payments) {
            double adjusted = p.getAdjustedAmount();
            System.out.printf("%s: %.2f%n", p.getType(), adjusted);
            total += adjusted;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
