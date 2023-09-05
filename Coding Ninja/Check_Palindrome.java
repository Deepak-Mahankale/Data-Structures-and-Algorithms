public class Solution {
    public static boolean isPalindrome(String str) {
        int size = str.length();
        for (int i = 0; i < size / 2; i++) {
            if (str.charAt(i) != str.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}