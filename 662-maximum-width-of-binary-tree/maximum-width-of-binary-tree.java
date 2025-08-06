class Solution {
    public int widthOfBinaryTree(TreeNode root) {
     if (root == null) return 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();
        nodeQueue.offer(root);
        indexQueue.offer(0);
        int maxWidth = 0;
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            int start = indexQueue.peek();
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = nodeQueue.poll();
                int index = indexQueue.poll() - start; 
                if (i == 0) first = index;
                if (i == size - 1) last = index;
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                    indexQueue.offer(2 * index + 1);
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                    indexQueue.offer(2 * index + 2);
                }
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}
