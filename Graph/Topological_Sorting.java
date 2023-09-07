import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sorting {
    static void dfs(ArrayList<ArrayList<Integer>> adj, Stack<Integer> st, int node, int[] vist) {
        vist[node] = 1;
        for (int it : adj.get(node)) {
            if (vist[it] == 0) {
                dfs(adj, st, it, vist);
            }
        }
        st.push(node);
    }

    public static int[] topo_sort(int[][] edges, int v) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int[] vist = new int[v];
        int[] result = new int[v];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (vist[i] == 0) {
                dfs(adj, st, i, vist);
            }
        }
        int i = 0;
        while (!st.isEmpty()) {
            result[i++] = st.peek();
            st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] edges = { { 4, 0 }, { 4, 1 }, { 5, 0 }, { 5, 2 }, { 3, 1 }, { 2, 3 } };
        int v = 6;
        int[] ans = topo_sort(edges, v);
        for (int it : ans) {
            System.out.print(it + " ");
        }
    }
}
