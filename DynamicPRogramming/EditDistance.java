class EditDistance {
    public static int editDist(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];

        // Base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i; // i deletions
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j; // j insertions
        }

        // Fill dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // no change
                } else {
                    int add = dp[i][j - 1];     // insertion
                    int del = dp[i - 1][j];     // deletion
                    int rep = dp[i - 1][j - 1]; // replacement

                    dp[i][j] = 1 + Math.min(add, Math.min(del, rep));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "intention";
        String str2 = "execution";

        System.out.println("Edit distance = " + editDist(str1, str2));
    }
}
