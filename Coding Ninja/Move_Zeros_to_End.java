public class Solution {
    public static int[] moveZeros(int n, int[] a) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j != -1) {
            for (int i = j + 1; i < n; i++) {
                if (a[i] != 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                }
            }
        }
        return a;
    }
}