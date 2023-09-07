import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Single_Source_Shortest_Path {
    public static void main(String[] args) {
        int n = 9, m = 10;
        int[][] edge = { { 0, 1 }, { 0, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 1, 2 }, { 2, 6 }, { 6, 7 }, { 7, 8 },
                { 6, 8 } };

        Solution obj = new Solution();
        int res[] = obj.shortestPath(edge, n, m, 0);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}

class Solution {
    public int[] shortestPath(int[][] edge, int n, int m, int src) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = (int) 1e9;
        }
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            adj.get(edge[i][0]).add(edge[i][1]);
            adj.get(edge[i][1]).add(edge[i][0]);
        }
        dist[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            for (int it : adj.get(node)) {
                if (dist[node] + 1 < dist[it]) {
                    dist[it] = dist[node] + 1;
                    q.add(it);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (dist[i] == 1e9) {
                dist[i] = -1;
            }
        }

        return dist;
    }
}