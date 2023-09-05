public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3, 8, 9, 15, 10, 12 };
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
