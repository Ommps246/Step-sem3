public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();

            if (length == 0) {
                continue;
            } else if (length <= 4) {
                shortCount++;
            } else if (length <= 8) {
                mediumCount++;
            } else {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount
                + " | Medium: " + mediumCount
                + " | Long: " + longCount);
    }

    private static void profile(String review) {
        System.out.println("Review: \"" + review + "\"");
        classifyWordLengths(review);
        System.out.println();
    }

    public static void main(String[] args) {
        profile("This movie was absolutely fantastic and thrilling");
        profile("Good film but the pacing felt inconsistent throughout");
    }
}
