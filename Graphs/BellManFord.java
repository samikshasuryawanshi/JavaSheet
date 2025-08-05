import java.util.*;

class BellManFord {

    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int w) {
            this.src = src;
            this.dest = dest;
            this.weight = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];

        // Step 1: Initialize distances
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Step 2: Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < V; j++) {
                for (Edge e : graph[j]) {
                    if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.weight < dist[e.dest]) {
                        dist[e.dest] = dist[e.src] + e.weight;
                    }
                }
            }
        }

        // Step 3: Check for negative-weight cycles
        // for (int j = 0; j < V; j++) {
        //     for (Edge e : graph[j]) {
        //         if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.weight < dist[e.dest]) {
        //             System.out.println("Negative weight cycle detected!");
        //             return;
        //         }
        //     }
        // }

        // Print distances
        for (int i = 0; i < V; i++) {
            System.out.print((dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]) + " ");
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        bellmanFord(graph, src);
    }
}
