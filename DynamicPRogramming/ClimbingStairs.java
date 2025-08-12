
import java.util.Arrays;

class ClimbingStairs{
    public int climbStairs(int n) {
        if(n==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    //optimal way
    public int climbStairsOptimal(int n , int[] dp) {
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = climbStairsOptimal(n - 1, dp) + climbStairsOptimal(n - 2, dp);
        return dp[n];
       
    }

    public static int climbStairsTabulation(int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 1;
        for(int i = 1; i <= n;i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];       
    }

    public static void main(String[] args) {
        int n =5;
         int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Number of ways to climb " + n + " stairs: " + new ClimbingStairs().climbStairsOptimal(n, dp));

        System.out.println("Number of ways to climb " + n + " stairs using tabulation: " + climbStairsTabulation(n));
    }
}