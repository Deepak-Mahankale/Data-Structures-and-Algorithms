public class Solution {
    public static int countingGraphs(int N) {
        return (int) Math.pow(2, (N * (N - 1)) / 2);
    }
}