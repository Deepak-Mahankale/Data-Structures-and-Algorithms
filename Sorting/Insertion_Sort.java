public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3, 8, 9, 15, 10, 12 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
