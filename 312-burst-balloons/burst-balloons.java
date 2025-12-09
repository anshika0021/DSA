class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 2];
        arr[0] = 1;
        arr[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }
        int[][] dp = new int[n + 2][n + 2];

        return burst(arr, 1, n, dp);
    }
    private int burst(int[] arr, int i, int j, int[][] dp) {
        if (i > j) return 0;

        if (dp[i][j] != 0) return dp[i][j];

        int max = 0;

        for (int k = i; k <= j; k++) {
            int coins =
                    burst(arr, i, k - 1, dp) +
                    arr[i - 1] * arr[k] * arr[j + 1] +
                    burst(arr, k + 1, j, dp);

            max = Math.max(max, coins);
        }

        dp[i][j] = max;
        return max;
    }
}
