import java.util.*;
class KahnsAlgo{
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
        
       graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void calDegree(ArrayList<Edge> graph[], int indegree[]) {
            for (int i = 0; i < graph.length; i++) {
                for (Edge e : graph[i]) {               
                    indegree[e.dest]++;
            }
        }
    }

    public static void kahnsAlgorithm(ArrayList<Edge> graph[]) {
        int V = graph.length;
        int indegree[] = new int[V];

        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<indegree.length;i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }

        while(!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " ");   
            for(int i =0;i<graph[curr].size();i++) {
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;
                if(indegree[e.dest] == 0) {
                    queue.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int indegree[] = new int[V];
        calDegree(graph, indegree);
        System.out.println("Indegree of vertices:");
        for (int i = 0; i < indegree.length; i++) {
            System.out.print(indegree[i] + " ");
        }
        System.out.println();

        System.out.println("Topological Sort using Kahn's Algorithm:");
        kahnsAlgorithm(graph);


    }
}