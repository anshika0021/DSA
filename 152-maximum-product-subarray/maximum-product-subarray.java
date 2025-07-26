class Solution {
    public int maxProduct(int[] nums) {
        int maxE = nums[0];  
        int minE = nums[0];  
        int maxF = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxE;

            maxE = Math.max(nums[i], Math.max(nums[i] * maxE, nums[i] * minE));
            minE = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * minE));

            maxF = Math.max(maxF, maxE);
        }

        return maxF;
    }
}
