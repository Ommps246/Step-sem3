public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    private static void hunt(String text) {
        char result = findFirstNonRepeatingChar(text);

        System.out.println("Input: \"" + text + "\"");
        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result + "'");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        hunt("swiss");
        hunt("aabbcc");
        hunt("programming");
    }
}
