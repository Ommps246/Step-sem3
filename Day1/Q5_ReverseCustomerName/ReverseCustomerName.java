public class ReverseCustomerName {

    public static String reverseCustomerName(String customerName) {
        char[] characters = customerName.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }
        return reversed.toString();
    }

    private static void verify(String name) {
        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverseCustomerName(name));
        System.out.println("Original after call (unchanged): " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        verify("Sunil");
        verify("Anita");
    }
}
