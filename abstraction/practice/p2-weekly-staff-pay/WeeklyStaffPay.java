abstract class Staff {
    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    public abstract double getPay();

    public String getName() {
        return name;
    }
}

class FullTimeStaff extends Staff {
    private double weeklySalary;

    public FullTimeStaff(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    public double getPay() {
        return weeklySalary;
    }
}

class HourlyStaff extends Staff {
    private double hours;
    private double rate;

    public HourlyStaff(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    public double getPay() {
        if (hours <= 40) {
            return hours * rate;
        }
        return 40 * rate + (hours - 40) * rate * 1.5;
    }
}

class Intern extends Staff {
    private double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    public double getPay() {
        return stipend;
    }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        Staff[] staffMembers = new Staff[3];
        staffMembers[0] = new FullTimeStaff("Asha", 12000);
        staffMembers[1] = new HourlyStaff("Ravi", 45, 200);
        staffMembers[2] = new Intern("Neha", 5000);
        double total = 0;
        for (Staff s : staffMembers) {
            double pay = s.getPay();
            System.out.printf("%s: %.2f%n", s.getName(), pay);
            total += pay;
        }
        System.out.printf("Total Payroll: %.2f%n", total);
    }
}
