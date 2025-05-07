class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        traverse(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void traverse(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        path.add(root.val);

        if (root.left == null && root.right == null && targetSum == root.val) {
            result.add(new ArrayList<>(path));
        }

        traverse(root.left, targetSum - root.val, path, result);
        traverse(root.right, targetSum - root.val, path, result);
        path.remove(path.size() - 1);
    }
}
