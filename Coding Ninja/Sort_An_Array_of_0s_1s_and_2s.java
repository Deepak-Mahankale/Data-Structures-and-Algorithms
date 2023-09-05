import java.util.*;
import java.io.*;

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int temp = arr.get(mid);
                arr.add(mid, arr.get(low));
                arr.add(low, temp);
                mid++;
                low++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(high);
                arr.add(high, arr.get(mid));
                arr.add(mid, temp);

                high--;
            }
        }
    }
}
