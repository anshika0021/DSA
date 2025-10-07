class Solution {
    public int longestSubsequence(int[] nums) {
        int hel = 0;
        int non =0;
        int n=nums.length;
        for(int num : nums){
            hel ^= num;
            if(num !=0){
                non++;
            }
        }
        if(hel != 0){
            return n;
        }
        if(non ==0){
            return 0;
        }
        return nums.length-1;
    }
}