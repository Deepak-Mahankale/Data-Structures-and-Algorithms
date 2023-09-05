public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 1, 100, 521, 84, 21 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
