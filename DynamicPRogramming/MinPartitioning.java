class MinPartitioning{

    public static int MP(int nums[]){
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
        }

        int W = sum/2;

        int dp[][] = new int[n+1][W+1];

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                if(nums[i-1] <= j){
                   dp[i][j] = Math.max(nums[i-1] + dp[i-1][j-nums[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int s1 = dp[n][W];
        int s2 = sum - s1;
        return Math.abs(s1 - s2);
    
    
    }
    public static void main(String[] args) {
        int nums[] = {1,6,11,5};

        System.out.println("Minimum difference = " + MP(nums));
        
    }
}