abstract class LibraryItem {
    protected String title;
    protected int daysLate;

    public LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    public abstract double getFine();

    public String getTitle() {
        return title;
    }
}

class Book extends LibraryItem {
    public Book(String title, int daysLate) {
        super(title, daysLate);
    }

    public double getFine() {
        return 2.0 * daysLate;
    }
}

class Dvd extends LibraryItem {
    public Dvd(String title, int daysLate) {
        super(title, daysLate);
    }

    public double getFine() {
        double fine = 5.0 * daysLate;
        if (fine > 50) {
            fine = 50;
        }
        return fine;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title, int daysLate) {
        super(title, daysLate);
    }

    public double getFine() {
        return 1.0 * daysLate;
    }
}

public class LibraryLateFineCounter {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("Algebra", 4);
        items[1] = new Dvd("Inception", 12);
        items[2] = new Magazine("Sports", 3);
        double total = 0;
        for (LibraryItem item : items) {
            double fine = item.getFine();
            System.out.printf("%s: %.2f%n", item.getTitle(), fine);
            total += fine;
        }
        System.out.printf("Total Fines: %.2f%n", total);
    }
}
