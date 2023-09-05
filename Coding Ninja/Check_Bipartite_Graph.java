import java.util.ArrayList;

public class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>> edges, int[] vis, int node, int col) {
        vis[node] = col;

        for (int e : edges.get(node)) {
            if (vis[e] == -1) {
                if (!dfs(edges, vis, e, 1 - col)) {
                    return false;
                }
            } else if (vis[e] == col) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.size(); i++) {
            for (int j = 0; j < edges.size(); j++) {
                if (edges.get(i).get(j) == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[] vis = new int[edges.size()];
        for (int i = 0; i < edges.size(); i++) {
            vis[i] = -1;
        }
        for (int i = 0; i < edges.size(); i++) {
            if (vis[i] == -1) {
                if (!dfs(adj, vis, i, 0)) {
                    return false;
                }
            }
        }

        return true;
    }
}