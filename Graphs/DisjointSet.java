class DisjointSet{
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
    public static void main(String[] args) {
        
        init();
        union(1, 3);
        System.out.println("1 and 3 are connected: " + (find(1) == find(3)));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}