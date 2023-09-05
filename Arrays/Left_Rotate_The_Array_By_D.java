public class Left_Rotate_The_Array_By_D {

    public static void reverseFun(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return;
    }

    public static void printt(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 550, 60 };
        int k = 3;
        int n = arr.length - 1;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        reverseFun(arr, 0, n);
        reverseFun(arr, 0, k - 1);
        reverseFun(arr, k, n);
        printt(arr);

        /*
         * int k = 3;
         * int idx = 0;
         * int[] temp = new int[k];
         * for (int i : arr) {
         * System.out.print(i + " ");
         * }
         * System.out.println();
         * for (int i = 0; i < k; i++) {
         * temp[i] = arr[i];
         * }
         * 
         * for (int i = k; i < arr.length; i++) {
         * arr[i - k] = arr[i];
         * }
         * 
         * for (int i = arr.length - k; i < arr.length; i++) {
         * arr[i] = temp[idx];
         * idx++;
         * }
         * for (int i : arr) {
         * System.out.print(i + " ");
         * }
         */

    }
}
