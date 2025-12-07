class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int N = nums.length;
        for(int i = 0;i<N;i++){
            sum  = sum+nums[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        
        return subset(nums,sum/2);
   
    }
    public static boolean subset(int nums[], int target){
        int N = nums.length;
        boolean dp[][] = new boolean[N + 1][target + 1];
        for (int i = 0; i <=N; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= target; j++) {

                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][target];
    }
}