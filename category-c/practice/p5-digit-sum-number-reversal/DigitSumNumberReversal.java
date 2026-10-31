public class DigitSumNumberReversal {
    public static void main(String[] args) {
        int number = 4721;
        int sum = 0;
        int reverse = 0;
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reverse);
    }
}
