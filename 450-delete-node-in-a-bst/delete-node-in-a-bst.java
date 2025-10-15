class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(key<root.val){
            root.left = deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.val = minval(root.right);
            root.right = deleteNode(root.right,root.val);

        }
        return root;
    }
    public static int minval(TreeNode root){
        int minv = root.val;
        while(root.left != null){
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }
}