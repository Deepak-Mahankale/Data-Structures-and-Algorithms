public class Solution {
    public static int partation(int[] input, int low, int high) {
        int piv = input[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (input[j] < piv) {
                i++;
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
        }
        i++;
        int temp = input[i];
        input[i] = piv;
        input[high] = temp;
        return i;
    }

    public static void quickSort(int[] input, int startIndex, int endInedx) {
        if (startIndex < endInedx) {
            int pivIdx = partation(input, startIndex, endInedx);
            quickSort(input, startIndex, pivIdx - 1);
            quickSort(input, pivIdx + 1, endInedx);
        }
    }
}