class Solution {
    public int findPeakElement(int[] nums) {
        
        if (nums == null || nums.length == 0) return -1;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[mid+1]) {
                low = mid + 1;
            } else {
                high=mid;
            }
        }
        return low;
    }
}