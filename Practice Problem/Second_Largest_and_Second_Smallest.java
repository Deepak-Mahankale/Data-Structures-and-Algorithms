import java.util.Arrays;

public class Second_Largest_and_Second_Smallest {

    /*
     * public static void findValues(int[] arr, int x) {
     * int Smallest = Integer.MAX_VALUE;
     * int Sec_Smallest = Integer.MAX_VALUE;
     * 
     * int Largest = Integer.MIN_VALUE;
     * int Sec_Largest = Integer.MIN_VALUE;
     * int i;
     * for (i = 0; i < x; i++) {
     * Smallest = Math.min(Smallest, arr[i]);
     * Largest = Math.max(Largest, arr[i]);
     * }
     * for (i = 0; i < x; i++) {
     * if (arr[i] < Sec_Smallest && arr[i] != Smallest) {
     * Sec_Smallest = arr[i];
     * }
     * if (arr[i] > Sec_Largest && arr[i] != Largest) {
     * Sec_Largest = arr[i];
     * }
     * }
     * 
     * System.out.println(Sec_Smallest + " " + Sec_Largest);
     * 
     * }
     */

    private static int S_Large(int[] arr, int a) {
        int large = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            if (arr[i] > large) {
                sl = large;
                large = arr[i];
            } else if (arr[i] > sl && arr[i] != large) {
                sl = arr[i];
            }
        }

        return sl;
    }

    private static int S_Small(int[] arr, int a) {
        int secSml = Integer.MAX_VALUE;
        int sml = Integer.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            if (arr[i] < sml) {
                secSml = sml;
                sml = arr[i];
            } else if (arr[i] < secSml && arr[i] != sml) {
                secSml = arr[i];
            }
        }
        return secSml;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 1, 100, 521, 84, 21 };
        int n = arr.length;

        int Second_Lar = S_Large(arr, n);
        int Second_Sml = S_Small(arr, n);

        System.out.println(Second_Lar + " " + Second_Sml);
        // findValues(arr, n);
        /*
         * for (int j = 0; j < n - 1; j++) {
         * int min = j;
         * for (int i = j + 1; i < n; i++) {
         * if (arr[i] < arr[min]) {
         * min = i;
         * }
         * int temp = arr[j];
         * arr[j] = arr[min];
         * arr[min] = temp;
         * }
         * }
         */
        // Arrays.stream(arr).forEach(System.out::println);
        // System.out.println("Second Smallest: " + arr[1]);
        // System.out.println("Second Largest: " + arr[n - 2]);
    }
}
