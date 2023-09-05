import java.util.ArrayList;

public class Solution {

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, ArrayList<Integer> ds) {
        vis[node] = 1;
        ds.add(node);
        for (Integer x : adj.get(node)) {
            if (vis[x] == 0) {
                dfs(x, adj, vis, ds);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] vis = new int[v];
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) {
            int m = edges.get(i).get(0);
            int n = edges.get(i).get(1);
            adj.get(n).add(m);
            adj.get(m).add(n);
        }

        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                ArrayList<Integer> ds = new ArrayList<>();
                dfs(i, adj, vis, ds);
                res.add(ds);
            }
        }
        return res;

    }
}