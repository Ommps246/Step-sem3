public class ExamSeatDuplicateChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        for (int i = 0; i < seatNumbers.length; i++) {

            boolean alreadyReported = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyReported = true;
                    break;
                }
            }
            if (alreadyReported) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    private static void printSeats(int[] seatNumbers) {
        System.out.print("Seat Numbers: {");
        for (int i = 0; i < seatNumbers.length; i++) {
            System.out.print(seatNumbers[i]);
            if (i < seatNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] hallOne = {101, 102, 103, 102, 105};
        printSeats(hallOne);
        checkDuplicateSeats(hallOne);
        System.out.println();

        int[] hallTwo = {101, 102, 103, 104, 105};
        printSeats(hallTwo);
        checkDuplicateSeats(hallTwo);
    }
}
