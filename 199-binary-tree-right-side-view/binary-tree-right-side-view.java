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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root,0,result);
        return result;
        }
        private  void preorder(TreeNode root,int level,List<Integer> result){
            {
            if(root==null){
                return;
            }
            if(result.size()==level){
                result.add(root.val);
            }
        }
        preorder(root.right,level+1,result);
        preorder(root.left,level+1,result);
    }
}