import java.util.*;
class ConnectingCities{

    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost; // Default cost
        }

        @Override
        public int compareTo(Edge other) {
            return this.cost - other.cost; // Compare based on cost
        }

    }
    public static int connectCities(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[cities.length];

        pq.add(new Edge(0, 0)); // Start from the first city with cost 0
        int totalCost = 0;

        while (!pq.isEmpty()) {
            Edge current = pq.remove();
            if(!visited[current.dest]) {
                visited[current.dest] = true; // Mark the current city as visited
                totalCost += current.cost; // Add the cost of connecting this city

                // Add all edges from the current city to the priority queue
                for (int i = 0; i < cities[current.dest].length; i++) {
                    if (cities[current.dest][i] != 0 && !visited[i]) {
                        pq.add(new Edge(i, cities[current.dest][i]));
                    }
                }
            }
        }
        return totalCost; // Return the total cost of connecting all cities
    }

    public static void main(String[] args) {
        int cities[][] = {
            {0,1,2,3,4},
            {1,0,5,0,7},
            {2,5,0,6,0},
            {3,0,6,0,8},
            {4,7,0,8,0},
        };
        int totalCost = connectCities(cities);
        System.out.println("Total cost to connect all cities: " + totalCost);
    }
}