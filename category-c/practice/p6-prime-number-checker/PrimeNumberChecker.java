public class PrimeNumberChecker {
    public static void main(String[] args) {
        int[] numbers = {29, 21};
        for (int number : numbers) {
            boolean isPrime = true;
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(number + (isPrime ? " is prime" : " is not prime"));
        }
    }
}
