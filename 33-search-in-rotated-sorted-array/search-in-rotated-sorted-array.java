class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int right = nums.length-1;
        while(low<=right){
            int mid = (low+right)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[low]<=nums[mid]){
               if(nums[low]<=target && target<=nums[mid]){
                    right = mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[right]){
                    low = mid+1;
                }
                else{
                    right = mid-1;
                }

            }
        }
        return -1;
    }
}