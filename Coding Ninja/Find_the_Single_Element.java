public class Solution {
    public static int getSingleElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return num;
            }
        }
        return -1;

        /*
         * int xor=0;
         * for(int i=0;i<arr.length;i++){
         * xor=xor^arr[i];
         * }
         * 
         * return xor;
         */
    }
}