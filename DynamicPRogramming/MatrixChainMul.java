
import java.util.Arrays;

class MatrixChainMul{
    public static int MCM(int arr[],int i,int j){
        if(i == j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i;k<=j-1;k++){
            int cost1 = MCM(arr, i, k);
            int cost2 = MCM(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalC = cost1 + cost2 + cost3;

            ans = Math.min(ans, finalC);
        }
        return ans;
    }


    public static int MCMMemo(int arr[],int i,int j,int dp[][]){
        if(i == j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k = i; k<=j-1;k++){
            int c1 = MCMMemo(arr, i, k, dp);
            int c2 = MCMMemo(arr, k+1, j, dp);
            int c3 = arr[i-1] * arr[k] * arr[j];

            ans = Math.min(ans, c1 + c2 + c3);
        
        }
        return dp[i][j] = ans;
    
    }

    public static int MCMTab(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];

        //initialization
        for(int i =0;i<n;i++){
            dp[i][i] = 0;
        }

        for(int len = 2; len <= n-1;len++){
            for(int i = 1;i<=n-len;i++){
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for(int k = i;k<=j-1;k++){
                    int c1 = dp[i][k];
                    int c2 = dp[k+1][j];
                    int c3 = arr[i-1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(dp[i][j], c1 + c2 + c3);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n = arr.length;

        int dp[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }


        System.out.println("Minimum cost = " + MCM(arr, 1, n-1));
        System.out.println("Minimum cost = " + MCMMemo(arr, 1, n-1, dp));
        System.out.println("Minimum cost = " + MCMTab(arr));
        
    
        
        
    }
}