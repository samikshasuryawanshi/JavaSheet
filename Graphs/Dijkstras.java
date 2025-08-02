import java.util.*;
class Dijkstras{

    static class Edge{
        int src, dest, weight;

        Edge(int src, int dest, int w) {
            this.src = src;
            this.dest = dest;
            this.weight = w; // Default weight
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }   

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair o) {
            return this.path - o.path; // Ascending order based on path weight
        }
    }


    public static void dijkstra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE; // Initialize distances to infinity
            }
        }


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0)); // Start from the source node

        boolean visited[] = new boolean[graph.length];

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!visited[curr.n]) {
                visited[curr.n] = true; // Mark the current node as visited

                for(int i = 0;i<graph[curr.n].size();i++) {
                    Edge e = graph[curr.n].get(i);
                    int v = e.dest;
                    int weight = e.weight;
                    int u = e.src;

                    if(dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for(int i =0;i<dist.length;i++) {
            System.out.print(dist[i] + " ");
        }

    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;

        dijkstra(graph, src);
        
    }

}