class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>();
        for(int num : nums){
            maxheap.add(num);
            if(maxheap.size()>k){
                maxheap.remove();
            }
        }
        return maxheap.peek();
    }
}