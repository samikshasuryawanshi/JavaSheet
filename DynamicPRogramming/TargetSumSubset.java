class TargetSumSubset {
    public static boolean TargetSum(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        // i = items and j = target sum

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true; // sum = 0 is always possible with no items
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) { // FIXED: j not i
                int v = arr[i - 1];
                if (v <= j && dp[i - 1][j - v]) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j]) {
                    dp[i][j] = true;
                    
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 7, 1 };
        int sum = 10;

        System.out.println("Target sum = " + TargetSum(arr, sum));
    }
}
