import java.util.Arrays;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

public class Unique_elements {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        int i = 0;

        Set<Integer> set = new HashSet<Integer>();

        for (int a : arr) {
            set.add(a);
        }
        System.out.println(set);
        /*
         * for (int j = 1; j < arr.length; j++) {
         * if (arr[i] != arr[j]) {
         * i++;
         * arr[i] = arr[j];
         * }
         * }
         * 
         * Arrays.stream(arr).forEach(System.out::print);
         */

    }
}
