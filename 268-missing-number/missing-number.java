class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }
        xor ^= n;  // XOR with n as well
        return xor;
    }
}
