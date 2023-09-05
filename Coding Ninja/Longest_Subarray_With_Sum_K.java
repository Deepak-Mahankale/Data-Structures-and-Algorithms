import java.util.*;
import java.io.*;

public class Solution {
    public static int getLongestSubarray(int[] nums, int k) {
        int left = 0, right = 0;
        int sum = nums[0];
        int len = 0;
        while (right < nums.length) {
            while (left < right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                len = Math.max(len, right - left + 1);
            }
            right++;
            if (right < nums.length) {
                sum += nums[right];
            }
        }
        return len;
    }
}