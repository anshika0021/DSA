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
    int selfdiameter = 0; 
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root); 
        return selfdiameter;
    } 
    public int height(TreeNode root) {
        if (root == null) return 0;
        
        int leftdiameter= height(root.left);   
        int rightdiameter = height(root.right); 
        
        selfdiameter = Math.max(selfdiameter, leftdiameter + rightdiameter); 
        return Math.max(leftdiameter, rightdiameter)+1; 
    }
}
