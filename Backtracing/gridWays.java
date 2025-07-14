class gridWays{
    public static int GWays(int i,int j,int n,int m){
        if(i == n-1 && j == m-1){
            return 1; //last cell
        }
        else if(i == n || j == m){
            return 0;//bpundary condition
        }

        int w1 = GWays(i+1, j, n, m);
        int w2 = GWays(i, j+1, n, m);

        return  w1+w2;
    }
    public static void main(String[] args) {
        int n = 3, m=3;
        System.out.println("Number of ways to reach bottom right corner is : " + GWays(0, 0, n, m));
    }
}