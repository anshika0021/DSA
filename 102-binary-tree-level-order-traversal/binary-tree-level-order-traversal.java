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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> hello = new ArrayList<>();
        q.offer(root);
        int curr = 0;
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            hello.add(new ArrayList<>());
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                hello.get(level).add(node.val);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right!= null){
                    q.offer(node.right);
                }
                curr++; 
            }
            level++;
        }
        return hello;
    }
}