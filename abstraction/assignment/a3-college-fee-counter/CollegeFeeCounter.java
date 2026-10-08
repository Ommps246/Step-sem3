interface BusUser {
}

abstract class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public abstract double getTuition();

    public String getName() {
        return name;
    }

    public double getFee() {
        double fee = getTuition();
        if (this instanceof BusUser) {
            fee += 12000;
        }
        return fee;
    }
}

class DayScholar extends Student implements BusUser {
    public DayScholar(String name) {
        super(name);
    }

    public double getTuition() {
        return 40000;
    }
}

class Hosteller extends Student {
    public Hosteller(String name) {
        super(name);
    }

    public double getTuition() {
        return 40000 + 60000;
    }
}

class ScholarshipStudent extends Student implements BusUser {
    public ScholarshipStudent(String name) {
        super(name);
    }

    public double getTuition() {
        return 20000;
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new DayScholar("Asha");
        students[1] = new Hosteller("Ravi");
        students[2] = new ScholarshipStudent("Neha");
        double total = 0;
        for (Student s : students) {
            double fee = s.getFee();
            System.out.printf("%s: %.2f%n", s.getName(), fee);
            total += fee;
        }
        System.out.printf("Total Collected: %.2f%n", total);
    }
}
