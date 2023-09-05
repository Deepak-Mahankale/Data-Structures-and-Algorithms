public class Solution {
    public static void dfs(int[][] image, int[][] ans, int intiColor, int newColor, int[] delr, int[] delc, int row,
            int col) {

        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = row + delr[i];
            int ncol = col + delc[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == intiColor
                    && ans[nrow][ncol] != newColor) {
                dfs(image, ans, intiColor, newColor, delr, delc, nrow, ncol);
            }
        }
        return;

    }

    public static int[][] floodFill(int[][] image, int n, int m, int x, int y, int p) {
        int[][] ans = image;
        int intiColor = image[x][y];
        int newColor = p;
        int[] delr = { -1, 0, +1, 0 };
        int[] delc = { 0, +1, 0, -1 };

        dfs(image, ans, intiColor, newColor, delr, delc, x, y);
        return ans;

    }
}