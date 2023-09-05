import java.util.ArrayList;

public class Solution {
    public static Boolean dfs(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] vis, boolean[] pathvist) {
        vis[curr] = true;
        pathvist[curr] = true;
        for (int e : adj.get(curr)) {
            if (!vis[e]) {
                if (dfs(adj, e, vis, pathvist)) {
                    return true;
                }
            } else if (pathvist[e]) {
                return true;
            }
        }
        pathvist[curr] = false;
        return false;
    }

    public static Boolean isCyclic(int[][] edges, int v, int e) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] a : edges) {
            int src = a[0];
            int dest = a[1];
            adj.get(src).add(dest);
        }

        boolean[] pathvist = new boolean[v];
        boolean[] vis = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (dfs(adj, i, vis, pathvist)) {
                    return true;
                }
            }
        }

        return false;
    }
}