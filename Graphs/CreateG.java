
import java.util.ArrayList;

class CreateG{
    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void main(String[] args){
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i =0;i<V;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 2, 20));

        graph[2].add(new Edge(2, 3, 30));   
        graph[3].add(new Edge(3, 2, 30));
        graph[3].add(new Edge(3, 4, 50));
        graph[4].add(new Edge(4, 0, 60));

        for(int i =0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("Edge from " + e.src + " to " + e.dest + " with weight " + e.weight);
        }



    }
}