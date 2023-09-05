import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                ans.add(curr);
                vis[curr] = true;
                for (int i = 0; i < adj.get(curr).size(); i++) {
                    q.add(adj.get(curr).get(i));
                }
            }
        }
        return ans;
    }
}
