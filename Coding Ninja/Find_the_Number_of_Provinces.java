import java.util.ArrayList;

public class Solution {

    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visit, int curr) {
        visit[curr] = true;

        for (int a : adj.get(curr)) {
            if (!visit[a]) {
                dfs(adj, visit, a);
            }
        }
    }

    public static int findNumOfProvinces(int[][] roads, int n) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (roads[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int cnt = 0;
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                dfs(adj, visit, i);
                cnt++;
            }
        }
        return cnt;
    }
}