import java.util.ArrayList;
import java.util.Stack;

public class Shortest_Path_in_DAG {
    public static void main(String[] args) {
        int n = 6, m = 7;
        int[][] edge = { { 0, 1, 2 }, { 0, 4, 1 }, { 4, 5, 4 }, { 4, 2, 2 }, { 1, 2, 3 }, { 2, 3, 6 }, { 5, 3, 1 } };
        Solution obj = new Solution();
        int res[] = obj.shortestPath(n, m, edge);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

}

class Solution {
    public void topo_sort(ArrayList<ArrayList<Pair>> adj, Stack<Integer> st, int node, int[] vist) {
        vist[node] = 1;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int val = adj.get(node).get(i).first;
            topo_sort(adj, st, val, vist);
        }
        st.push(node);
    }

    class Pair {
        int first;
        int second;

        public Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    public int[] shortestPath(int n, int m, int[][] edge) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Pair> temp = new ArrayList<>();
            adj.add(temp);
        }
        for (int i = 0; i < m; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            int wt = edge[i][2];
            adj.get(u).add(new Pair(v, wt));
        }
        int[] vist = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (vist[i] == 0) {
                topo_sort(adj, st, i, vist);
            }
        }

        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = (int) 1e9;
        }
        dist[0] = 0;
        while (!st.isEmpty()) {
            int node = st.peek();
            st.pop();
            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                if (dist[node] + wt < dist[v]) {
                    dist[v] = dist[node] + wt;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (dist[j] == 1e9) {
                dist[j] = -1;
            }
        }

        return dist;
    }
}
