class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int size = nums.length;
        int sets = 1 << size;
        for (int i = 0; i < sets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < 32; j++) {
                if ((i & (1 << j)) != 0) { 
                    subset.add(nums[j]);
                }
            }
            list.add(subset);
        }
        return list;
    }
}