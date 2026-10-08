import java.time.LocalDate;

abstract class Plan {
    protected String name;
    protected LocalDate startDate;

    public Plan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public abstract int getValidityDays();

    public LocalDate getRenewalDate() {
        return startDate.plusDays(getValidityDays());
    }

    public String getName() {
        return name;
    }
}

class BasicPlan extends Plan {
    public BasicPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    public int getValidityDays() {
        return 30;
    }
}

class StandardPlan extends Plan {
    public StandardPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    public int getValidityDays() {
        return 90;
    }
}

class PremiumPlan extends Plan {
    public PremiumPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    public int getValidityDays() {
        return 365;
    }
}

public class StreamingPlanRenewalReminder {
    public static void main(String[] args) {
        Plan[] plans = new Plan[4];
        plans[0] = new BasicPlan("Asha", LocalDate.of(2024, 1, 15));
        plans[1] = new StandardPlan("Ravi", LocalDate.of(2024, 2, 1));
        plans[2] = new PremiumPlan("Neha", LocalDate.of(2024, 3, 10));
        plans[3] = new BasicPlan("Kiran", LocalDate.of(2024, 12, 20));
        for (Plan p : plans) {
            System.out.println(p.getName() + ": " + p.getRenewalDate());
        }
    }
}
