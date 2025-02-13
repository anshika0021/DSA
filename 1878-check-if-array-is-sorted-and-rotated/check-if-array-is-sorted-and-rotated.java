class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) { // Compare with next element in circular manner
                count++;
            }
            if (count > 1) return false; // More than 1 break -> not sorted & rotated
        }

        return true;
    }
}
