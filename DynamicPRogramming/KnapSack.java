class KnapSack{
    // Recursive solution
    public static int knapSackRec(int W, int wt[], int val[], int n) {
        if(W == 0 || n == 0){
            return 0;
        }

        if(wt[n-1] <= W){
            //include
            int ans1 = val[n-1] + knapSackRec(W - wt[n-1], wt, val, n - 1);
            //exclude
            int ans2 = knapSackRec(W, wt, val, n - 1);
            return Math.max(ans1, ans2);
        }else{
            //exclude
            return knapSackRec(W, wt, val, n - 1);
        }
    }

    //Memoization solution
    public static int knapSackMemo(int W, int wt[], int val[], int n, int dp[][]) {
        if(W == 0 || n == 0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){
            //include
            int ans1 = val[n-1] + knapSackMemo(W - wt[n-1], wt, val, n - 1, dp);
            //exclude
            int ans2 = knapSackMemo(W, wt, val, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];

        }
        else{
            //exclude
            dp[n][W] = knapSackMemo(W, wt, val, n - 1, dp);
            return dp[n][W];       
        }
    }

    public static int knapSackTab(int val[],int wt[],int W){
        int n = val.length;
        int dp[][] = new int[n + 1][W+1];
        for(int i = 0;i<dp.length;i++){//0th col
            dp[i][0] = 0;
        }
        for(int j = 0;j<dp[0].length;j++){//0th row
            dp[0][j] = 0;
        }

        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<W+1;j++){
                int v = val[i-1];
                int w = wt[i-1];

                if(w <= j){
                    //include
                    int inProfit = v + dp[i-1][j-w];
                    int exProfit = dp[i-1][j];

                    dp[i][j] = Math.max(inProfit, exProfit);
                }else{
                    int exProfit = dp[i-1][j];

                    dp[i][j] = exProfit;
 
                }
            }
        }
        return dp[n][W];

    }





    public static void main(String[] args) {
        int wt[] = {2,5,1,3,4};
        int val[] = {15,14,10,45,30};
        int W = 7;

        int dp[][] = new int[val.length + 1][W + 1];
        for(int i = 0; i <= val.length; i++){
            for(int j = 0; j <= W; j++){
                dp[i][j] = -1;
            }}

       System.out.println("Maximum value in Knapsack = " + knapSackRec(W, wt, val, val.length));
       System.out.println("Maximum value in Knapsack (Memoization) = " + knapSackMemo(W, wt, val, val.length, dp));
       
       System.out.println("Max value = " + knapSackTab(val, wt, W));

    }
}