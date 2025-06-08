class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incerese = true;
        boolean decrese = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                decrese = false;
            }
            if(nums[i]< nums[i-1]){
                incerese = false;
            }
        }
        return incerese || decrese;
    }
}