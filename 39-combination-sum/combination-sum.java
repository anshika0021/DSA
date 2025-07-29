public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), 0, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<Integer> current, int index, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;

        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], current, i, result);
            current.remove(current.size() - 1); 
        }
    }
}
