import java.util.ArrayList;
class DetectCycle {
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

        // graph[1].add(new Edge(1, 0,1));
        graph[1].add(new Edge(1, 3,1));
        // graph[2].add(new Edge(2, 0,1));
        // graph[2].add(new Edge(2, 4,1));
        // graph[3].add(new Edge(3, 1,1));
        // graph[3].add(new Edge(3, 4,1));
        // graph[3].add(new Edge(3, 5,1));
        // graph[4].add(new Edge(4, 2,1));
   
    }
    public static boolean isCyclic(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(graph, i, visited, -1)) {
                    return true; // Cycle detected
            }
        }
    }
    return false; // No cycle detected}
  }

    public static boolean isCyclicUtil(ArrayList<Edge> graph[], int curr, boolean visited[], int parent) {
        visited[curr] = true;

        for(int i =0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                if (isCyclicUtil(graph, e.dest, visited, curr)) {
                return true;
                }
            }
            else if(visited[e.dest] && e.dest != parent) {
                return true; // Cycle detected
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("Graph contains cycle: " + isCyclic(graph));
      
    }

}