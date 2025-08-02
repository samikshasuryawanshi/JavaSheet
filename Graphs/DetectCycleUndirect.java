import java.util.*;
class DetectCycleUndirect{
    static class Edge{
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;  
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCyclic(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        boolean recStack[] = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                if(isCyclicUtil(graph, i, visited, recStack)) {
                    return true; // Cycle found
                }
            }
        }
        return false; // No cycle found
    }

    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, int curr, boolean visited[], boolean recStack[]) {
        visited[curr] = true;  
        recStack[curr] = true; // Add to recursion stack
        for(Edge e : graph[curr]) {
            if(!visited[e.dest]) {
                if(isCyclicUtil(graph, e.dest, visited, recStack)) {
                    return true; // Cycle found in the recursive call
                }
            } else if(recStack[e.dest]) {
                return true; // Cycle found in the recursion stack
            }
        }
        recStack[curr] = false; // Remove from recursion stack
        return false; // No cycle found

    }


    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        if(isCyclic(graph)) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}