public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        int[] ans = new int[n];
        if (n == 0 || n == 1) {
            return ans;
        }
        if (n == 2) {
            ans[1] = 1;
            return ans;
        }
        ans[0] = 0;
        ans[1] = 1;
        int a = 0, b = 1, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            ans[i] = c;
            a = b;
            b = c;
        }
        return ans;
    }
}