class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxo=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count=0;
            }
            maxo=Math.max(count,maxo);

        }
        return maxo;
        
        
    }
}