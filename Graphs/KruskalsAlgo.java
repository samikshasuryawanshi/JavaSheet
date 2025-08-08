import java.util.*;
class KruskalsAlgo{
    static class Edge implements Comparable<Edge>{
        int src, dest, weight;
        Edge(int src, int dest, int w) {
            this.src = src;
            this.dest = dest;
            this.weight = w; // Default weight
        }


        @Override
        public int compareTo(Edge other) {
            return this.weight - other.weight; // Compare by weight
        }
    }
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];


    public static void init(){
        for(int i = 0; i < n; i++) {
            par[i] = i; // Each node is its own parent initially
        }
    }

    public static int find(int x){
        if(x == par[x]) {
            return x; // If x is its own parent, return x
        }

        return find(par[x]); // Path compression
    }

    public static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if(rank[rootX] == rank[rootY]) {
            par[rootY] = rootX; // Attach rootY to rootX
            rank[rootX]++;
        }else if(rank[rootX] < rank[rootY]) {
            par[rootX] = rootY; // Attach rootX to rootY
        }else{
            par[rootY] = rootX; // Attach rootY to rootX
        }
    }

    static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

    }

    public static void kruskalsMst(ArrayList<Edge> edges,int V) {
        init(); // Initialize parent and rank arrays
        Collections.sort(edges); // Sort edges by weight

        int mstCost = 0;
        int count=0;
        for(int i =0;count<V-1;i++){

            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB) {
                union(e.src, e.dest);
                mstCost += e.weight; // Add weight to MST cost
                count++; // Increment count of edges in MST
            }
        }
        System.out.println("Minimum Spanning Tree Cost: " + mstCost);

    }
    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalsMst(edges, V); // Find MST using Kruskal's algorithm
    }
}