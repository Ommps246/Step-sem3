public class FactorialCalculation {
    public static void main(String[] args) {
        int[] numbers = {5, 0};
        for (int number : numbers) {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
