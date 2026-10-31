public class LeapYearDetector {
    public static void main(String[] args) {
        int[] years = {2024, 1900, 2000};
        for (int year : years) {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(isLeap ? "Leap year" : "Not a leap year");
        }
    }
}
