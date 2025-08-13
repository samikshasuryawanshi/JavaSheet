class UnboundedKnapSack {
    public static int unboundedKnap(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // Base cases: dp[i][0] = 0 and dp[0][j] = 0 are default in Java, no need to set manually.

        for (int i = 1; i <= n; i++) { // start from 1 to avoid i-1 negative index
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    // Include item i-1 (unbounded → dp[i][...]) OR exclude it
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println("Max value = " + unboundedKnap(val, wt, W));
    }
}
