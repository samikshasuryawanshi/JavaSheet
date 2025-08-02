import java.util.*;
class isBaiPartite{
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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
       
    }  
    public static boolean  isbaipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            col[i] = -1;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<graph.length;i++) {
            if(col[i] == -1) {
                queue.add(i);
                col[i] = 0; // Start coloring with color 0
                while(!queue.isEmpty()) {
                    int curr = queue.poll();
                    for(int j =0;j<graph[curr].size();j++) {
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0; // Alternate color
                            col[e.dest] = nextCol;
                            queue.add(e.dest);
                        }else if(col[e.dest] == col[curr]) {
                            return false; // Same color found on both ends of an edge
                        }
                    }
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        if(isbaipartite(graph)) {
            System.out.println("The graph is bipartite.");
        } else {
            System.out.println("The graph is not bipartite.");
        }
    }


    //leetcode
     public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);  // -1 means unvisited

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                color[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int neighbor : graph[curr]) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[curr];
                            q.add(neighbor);
                        } else if (color[neighbor] == color[curr]) {
                            return false; // same color on both ends of an edge
                        }
                    }
                }
            }
        }

        return true;
    }
}