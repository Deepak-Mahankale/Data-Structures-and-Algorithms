import java.util.ArrayList;

public class Merge_Sort {

    public static void Merge_S(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        Merge_S(arr, start, mid);
        Merge_S(arr, mid + 1, end);
        Merge(arr, start, mid, end);
    }

    public static void Merge(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = start;
        int right = mid + 1;
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = start; i < end + 1; i++) {
            arr[i] = temp.get(i - start);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3, 8, 9, 15, 10, 12 };
        int n = arr.length;
        Merge_S(arr, 0, n - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
