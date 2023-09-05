import java.util.List;

public class Solution {
    // DFS
    static boolean undirected(List<List<Integer>> adj, boolean[] vis, int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < adj.get(curr).size(); i++) {
            int e = adj.get(curr).get(i);
            if (vis[e] && par != e) {
                return true;
            } else if (!vis[e]) {
                if (undirected(adj, vis, e, curr)) {
                    return true;
                }
            }
        }

        return false;
    }

    static class Graph {
        boolean detectCycle(int V, List<List<Integer>> adj) {
            return undirected(adj, new boolean[V], adj.get(0).get(0), -1);
        }
    };
}
