public class ExamScoreBandCounter {
    public static int countInBand(int[] scores, int low, int high) {
        int left = lowerBound(scores, low);
        int right = lowerBound(scores, high + 1);
        return right - left;
    }

    private static int lowerBound(int[] scores, int target) {
        int lo = 0;
        int hi = scores.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (scores[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));
        System.out.println(countInBand(scores, 90, 100));
    }
}
