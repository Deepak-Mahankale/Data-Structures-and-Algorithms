
public class Solution {
    public static void dfs(char[][] matrix, int[][] visit, int[] drow, int[] dcol, int n, int m, int row, int col) {
        visit[row][col] = 1;
        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && matrix[nrow][ncol] == 'O' && visit[nrow][ncol] == 0) {
                dfs(matrix, visit, drow, dcol, n, m, nrow, ncol);
            }
        }
    }

    public static void replaceOWithX(char matrix[][]) {
        int[] drow = { -1, 0, +1, 0 };
        int[] dcol = { 0, +1, 0, -1 };
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] visit = new int[n][m];

        for (int i = 0; i < n; i++) {
            // first col
            if (visit[i][0] == 0 && matrix[i][0] == 'O') {
                dfs(matrix, visit, drow, dcol, n, m, i, 0);
            }
            // last col;
            if (visit[i][m - 1] == 0 && matrix[i][m - 1] == 'O') {
                dfs(matrix, visit, drow, dcol, n, m, i, m - 1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (visit[0][j] == 0 && matrix[0][j] == 'O') {
                dfs(matrix, visit, drow, dcol, n, m, 0, j);
            }

            if (visit[n - 1][j] == 0 && matrix[n - 1][j] == 'O') {
                dfs(matrix, visit, drow, dcol, n, m, n - 1, j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visit[i][j] == 0) {
                    matrix[i][j] = 'X';
                }
            }
        }

    }
}