import java.util.*;
class BellManFord{
    
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
        
        graph[1].add(new Edge(1,3,-4));
        
        graph[2].add(new Edge(2,3,2));
        
        graph[3].add(new Edge(3,4,4));
        graph[4].add(new Edge(4,1,-1));


    }

}