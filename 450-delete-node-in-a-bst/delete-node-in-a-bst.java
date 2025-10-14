class Solution {
    public TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } 
        else {
            if (root.left == null && root.right == null) {
                return null;
            }

            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            else {
                TreeNode minRight = findMin(root.right);
                root.val = minRight.val; 
                root.right = deleteNode(root.right, minRight.val);
            }
        }
        return root;
    }
}
