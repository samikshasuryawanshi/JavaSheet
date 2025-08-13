import java.util.*;
class MinCostCutStick{
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] newCuts = new int[m + 2];
        System.arraycopy(cuts, 0, newCuts, 1, m);
        newCuts[0] = 0;
        newCuts[m + 1] = n;
        Arrays.sort(newCuts);

        int[][] dp = new int[m + 2][m + 2];

        for (int len = 2; len < m + 2; len++) { // length of segment
            for (int i = 0; i + len < m + 2; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                        newCuts[j] - newCuts[i] + dp[i][k] + dp[k][j]);
                }
                if (dp[i][j] == Integer.MAX_VALUE) dp[i][j] = 0; // no cuts in between
            }
        }
        return dp[0][m + 1];
    }
}