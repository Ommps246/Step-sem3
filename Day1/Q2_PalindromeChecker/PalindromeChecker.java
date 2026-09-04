public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }

        return new String(chars).equals(new String(reversed));
    }

    private static String label(boolean isPalindrome) {
        return isPalindrome ? "Palindrome" : "Not Palindrome";
    }

    private static void check(String text) {
        boolean a = isPalindromeIterative(text);
        boolean b = isPalindromeRecursive(text);
        boolean c = isPalindromeArrayReversal(text);

        System.out.println("Input: \"" + text + "\"");
        System.out.println("Iterative: " + label(a)
                + " | Recursive: " + label(b)
                + " | Array Reversal: " + label(c));
        System.out.println("All three approaches agree: " + ((a == b) && (b == c)));
        System.out.println();
    }

    public static void main(String[] args) {
        check("madam");
        check("hello");
        check("racecar");
    }
}
