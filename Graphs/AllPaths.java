import java.util.*;
class AllPaths{
    static class Edge {
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
        
       graph[0].add(new Edge(0, 3));
        
       graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void findAllPaths(ArrayList<Edge> graph[], int src, int dest, String path) {
        if(src == dest){
            System.out.println(path + dest);
            return;
        }

        for(int i = 0;i<graph[src].size();i++) {
            Edge e = graph[src].get(i);
            findAllPaths(graph, e.dest, dest, path + src + " -> ");
        }
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 5, dest = 1; // Example source and destination
        System.out.println("All paths from " + src + " to " + dest + ":");
        findAllPaths(graph, src, dest, "");

    }
}