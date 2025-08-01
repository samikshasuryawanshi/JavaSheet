import java.util.ArrayList;
class HasPath{
     static class Edge{
        int src, dest, weight;

        Edge(int src, int dest,int w) {
            this.src = src;
            this.dest = dest;
            this.weight = w; // Default weight
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,1));
        graph[0].add(new Edge(0, 2,1));

        graph[1].add(new Edge(1, 0,1));
        graph[1].add(new Edge(1, 3,1));

        graph[2].add(new Edge(2, 0,1));
        graph[2].add(new Edge(2, 4,1));

        graph[3].add(new Edge(3, 1,1));
        graph[3].add(new Edge(3, 4,1));
        graph[3].add(new Edge(3, 5,1));

        graph[4].add(new Edge(4, 2,1));
        graph[4].add(new Edge(4, 3,1));
        graph[4].add(new Edge(4, 5,1));

        graph[5].add(new Edge(5, 3,1));
        graph[5].add(new Edge(5, 4,1));
        graph[5].add(new Edge(5, 6,1));

        graph[6].add(new Edge(6, 5,1));
        
    }

    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean visited[]) {
        if (src == dest) {
            return true; // Found the destination
        }
        visited[src] = true; // Mark the current node as visited
        for (Edge e : graph[src]) {
            if (!visited[e.dest]) {
                if (hasPath(graph, e.dest, dest, visited)) {

                    return true; // Path found in the recursive call
                }
            }
        }
        return false; // No path found
    }
    public static void main(String[] args) {
        int V = 7; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean visited[] = new boolean[V];
        int src = 0; // Starting node
        int dest = 5; // Destination node

        boolean pathExists = hasPath(graph, src, dest, visited);
        System.out.println("Path exists from " + src + " to " + dest + ": " + pathExists);
    }
}