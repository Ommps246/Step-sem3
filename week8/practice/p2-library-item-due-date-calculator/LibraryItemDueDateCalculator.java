import java.time.LocalDate;

abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract int getBorrowDays();

    public String getTitle() {
        return title;
    }
}

class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    public int getBorrowDays() {
        return 14;
    }
}

class Dvd extends LibraryItem {
    public Dvd(String title) {
        super(title);
    }

    public int getBorrowDays() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    public int getBorrowDays() {
        return 3;
    }
}

public class LibraryItemDueDateCalculator {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("1984");
        items[1] = new Dvd("The Matrix");
        items[2] = new Magazine("Forbes Issue 500");
        for (LibraryItem item : items) {
            LocalDate dueDate = currentDate.plusDays(item.getBorrowDays());
            System.out.println(item.getTitle() + ": " + dueDate);
        }
    }
}
