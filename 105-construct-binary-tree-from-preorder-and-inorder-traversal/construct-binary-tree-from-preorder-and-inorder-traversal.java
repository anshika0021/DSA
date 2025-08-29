/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int preIndex = 0; 
    Map<Integer, Integer> inMap = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // store inorder value -> index for quick lookup
        for(int i=0; i<inorder.length; i++){
            inMap.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }
    
    private TreeNode helper(int[] preorder, int inStart, int inEnd) {
        if(inStart > inEnd) return null;
        
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        
        int inIndex = inMap.get(rootVal); // root index in inorder
        
        // Build left & right subtrees
        root.left = helper(preorder, inStart, inIndex - 1);
        root.right = helper(preorder, inIndex + 1, inEnd);
        
        return root;
    }
}
