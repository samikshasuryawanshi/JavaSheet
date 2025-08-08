import java.util.*;

class PrimsAlgo{
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

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,2,35));
        graph[1].add(new Edge(1,3,25));


        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,1,35));
        graph[2].add(new Edge(2,3,20));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,25));
        graph[3].add(new Edge(3,2,20));

        
    }
    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;

        }

        @Override
        public int compareTo(Pair o) {
            return this.cost - o.cost; // Sort by cost in ascending order
        }
    }



    public static void prims(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0,0));
        int fcost = 0;


        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!visited[curr.v]){
                visited[curr.v] = true;
                fcost += curr.cost; 

                for(Edge e : graph[curr.v]) {
                    if(!visited[e.dest]) {
                        pq.add(new Pair(e.dest, e.weight));
                    }
                }
            }
        }

        System.out.println("Minimum Cost of Spanning Tree: " + fcost);


        
    }

    public static void main(String[] args) {

        int V = 4; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        prims(graph);


        
    }
}