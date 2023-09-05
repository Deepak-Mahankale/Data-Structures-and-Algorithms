import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[5].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], int V, Boolean[] visited, int i) {
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int k = 0; k < graph[curr].size(); k++) {
                    Edge e = graph[curr].get(k);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, Boolean[] vissited) {
        System.out.print(curr + " ");
        vissited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vissited[e.dest] == false) {
                dfs(graph, e.dest, vissited);
            }

        }

    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        Boolean[] visited = new Boolean[V];
        for (int j = 0; j < V; j++) {
            visited[j] = false;
        }
        for (int i = 0; i < V; i++) {
            // bfs(graph, V, visited, i);
            if (visited[i] == false) {
                dfs(graph, i, visited);
            }

        }

        System.out.println();
        /*
         * for (int i = 0; i < graph[ 2].size(); i++) {
         * Edge e = graph[2].get(i);
         * System.out.println(e.dest + " , " + e.wt + " ");
         * }
         */

    }
}
