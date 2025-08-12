import java.util.*;

public class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) totalSum += num;

        long remainder = totalSum % p;
        if (remainder == 0) return 0; 

        Map<Long, Integer> modIndex = new HashMap<>();
        modIndex.put(0L, -1); 

        long prefixSum = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum = (prefixSum + nums[i]) % p;
            long targetMod = (prefixSum - remainder + p) % p;

            if (modIndex.containsKey(targetMod)) {
                minLen = Math.min(minLen, i - modIndex.get(targetMod));
            }

            modIndex.put(prefixSum, i);
        }

        return (minLen == nums.length) ? -1 : minLen;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 1, 4, 2};
        int p = 6;
        System.out.println(sol.minSubarray(nums, p)); 
    }
}
