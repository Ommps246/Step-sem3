public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        int shift = k % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + shift) % n] = nums[i];
        }

        return result;
    }

    static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        printArray(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        printArray(rotateArray(new int[]{1, 2}, 3));
    }
}
