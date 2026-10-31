public class WordReverserPalindromeChecker {
    public static void main(String[] args) {
        String[] words = {"level", "java"};
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            String reversed = sb.toString();
            boolean isPalindrome = word.equals(reversed);
            System.out.println(reversed + " - " + (isPalindrome ? "palindrome" : "not a palindrome"));
        }
    }
}
