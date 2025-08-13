class LongestCommonSub{
    public static int longestComRec(String str1, String str2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return 1 + longestComRec(str1, str2, n-1, m-1);
        }else{
            int ans1 = longestComRec(str1, str2, n-1, m);
            int ans2 = longestComRec(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }

    public static int longestComMemo(String str1, String str2, int n, int m, int dp[][]){
        if(n == 0 || m == 0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = 1 + longestComMemo(str1, str2, n-1, m-1, dp);
        }else{
            int ans1 = longestComMemo(str1, str2, n-1, m, dp);
            int ans2 = longestComMemo(str1, str2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static int longestComTab(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){ 
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                } 
            }
        }
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }


    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";

        int dp[][] = new int[str1.length() + 1][str2.length() + 1];

        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }




        System.out.println("Longest common subsequence = " + longestComRec(str1, str2, str1.length(), str2.length())); 
        System.out.println("Longest common subsequence = " + longestComMemo(str1, str2, str1.length(), str2.length(), dp));
        System.out.println("Longest common subsequence = " + longestComTab(str1, str2));
         
    }
}