
import java.util.*;

class CheapestFlights{
    static class Edge {
        int src, dest, weight;  
        public Edge(int src, int dest, int w) {
            this.src = src;
            this.dest = dest;
            this.weight = w; // Default weight
        }

    }

    static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        for(int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int weight = flights[i][2];

           Edge e = new Edge(src, dest, weight);
           graph[src].add(e);
        }


    }
    static class Info {
        int v, cost, stops;
        public Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops; // Number of stops made
        }
    }

    public static int cheapestFlight(int flights[][], int src, int dest, int k, int n) {

        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);
        int dist[] = new int[n];
        for(int i = 0; i < n; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE; // Initialize distances to infinity
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0)); // Start from source with cost 0 and 0 stops

        while(!q.isEmpty()) {
            Info curr = q.remove();

            if(curr.stops > k) {
                break;
            }

            for(int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int cost = e.weight;

                if(curr.cost + cost < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + cost;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }
        if(dist[dest] == Integer.MAX_VALUE) {
            return -1; // No path found
        }
        return dist[dest]; // Return the minimum cost to reach destination
    }

    public static void main(String[] args) {
        int n = 4; // Number of vertices
        int flights[][] = {{0, 1, 100}, {0, 2, 500}, {1, 2, 100}, {1, 3, 200}, {2, 3, 100}};

        int src = 0; // Starting vertex
        int dest = 3; // Destination vertex
        int k = 1; // Maximum number of stops allowed
        int result = cheapestFlight(flights, src, dest, k, n);
        System.out.println("Cheapest flight cost from " + src + " to " + dest + " with at most " + k + " stops: " + result);

    
    }
}