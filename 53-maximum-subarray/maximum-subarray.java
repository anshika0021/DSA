class Solution {
    public int maxSubArray(int[] nums) {
        int maxE = nums[0];
        int maxF = nums[0];
        for(int i=1;i<nums.length;i++){
            maxE = Math.max(nums[i],nums[i]+maxE);
            maxF = Math.max(maxF,maxE);
        } 
        return maxF;
    }
}