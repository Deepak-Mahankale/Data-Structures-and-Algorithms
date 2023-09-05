import java.util.*;
import java.io.*;

class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}