/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> one = new ArrayList<>();
        Inorder(root , one);
        return one;
        }
        private void Inorder(TreeNode root,List<Integer> one)
        {
            if(root==null){
                return;
            }
            Inorder(root.left,one);
            one.add(root.val);
            Inorder(root.right,one);
      
    }
}