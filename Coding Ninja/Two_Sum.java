import java.util.Arrays;

public class Solution {
    public static String read(int n, int[] book, int target) {
        int sum = target;
        int count = 0;
        Arrays.sort(book);
        for (int i = 0; i < book.length; i++) {
            if (book[i] <= sum) {
                count++;
                sum = sum - book[i];
            }
        }
        if (count >= 2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}