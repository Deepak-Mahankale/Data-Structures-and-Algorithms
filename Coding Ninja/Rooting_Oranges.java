import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static class pair {
        int row;
        int col;
        int tm;

        public pair(int r, int c, int t) {
            this.row = r;
            this.col = c;
            this.tm = t;
        }
    }

    public static int minTimeToRot(int[][] grid, int n, int m) {
        Queue<pair> q = new LinkedList<>();
        int[][] visit = new int[n][m];
        int cnt_frh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new pair(i, j, 0));
                    visit[i][j] = 2;
                } else {
                    visit[i][j] = 0;
                }
                if (grid[i][j] == 1) {
                    cnt_frh++;
                }
            }
        }

        int tm = 0;
        int[] drow = { -1, 0, +1, 0 };
        int[] dcol = { 0, +1, 0, -1 };
        int cnt = 0;
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            q.remove();
            tm = Math.max(tm, t);
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visit[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    q.offer(new pair(nrow, ncol, t + 1));
                    visit[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }

        if (cnt != cnt_frh) {
            return -1;
        }

        return tm;
    }

}
