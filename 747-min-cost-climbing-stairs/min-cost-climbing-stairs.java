class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return mcs(n, cost, dp);
    }
    public int mcs(int n, int[] cost, int[] dp) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int first = mcs(n - 1, cost, dp) + cost[n - 1];
        int second = mcs(n - 2, cost, dp) + cost[n - 2];
        dp[n] = Math.min(first, second);
        return dp[n];
    }
}
