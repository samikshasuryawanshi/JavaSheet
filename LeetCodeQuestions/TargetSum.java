class TargetSum{
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        int zeroCount = 0;

        for (int num : nums) {
            totalSum += num;
            if (num == 0) zeroCount++;
        }

        if ((totalSum + target) % 2 != 0 || Math.abs(target) > totalSum) {
            return 0;
        }

        int subsetSum = (totalSum + target) / 2;
        int ways = countSum(nums, subsetSum);
        return (int)(ways * Math.pow(2, zeroCount));
    }

    private int countSum(int nums[], int sum) {
        int n = nums.length;
        int dp[][] = new int[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (nums[i - 1] != 0 && nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}