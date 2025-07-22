import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;
        int count = 1; 
        int prev = nums[n - 1]; 

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != prev) {
                count++;
                prev = nums[i];
                if (count == 3) {
                    return nums[i]; 
                }
            }
        }

        return nums[n - 1]; 
    }
}
