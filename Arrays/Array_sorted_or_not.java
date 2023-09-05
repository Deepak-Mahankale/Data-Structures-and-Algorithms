public class Array_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 25, 40, 50 };
        int n = arr.length;
        Boolean result = check(arr, n);
        System.out.println(result);
    }

    public static Boolean check(int[] arr, int a) {
        for (int i = 0; i < a - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
