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
    public int minDepth(TreeNode root) {
      
        if(root==null)return 0;
        return help(root);
        
    }
    public int help(TreeNode root) {
        if(root==null)return 0;
        if(root.left == null && root.right == null){
            return 1;
        }else if(root.left == null){
            return help(root.right)+1;
        }else if(root.right == null){
            return help(root.left)+1;
        }else{
            int l=help(root.left);
            int r=help(root.right);
            return Math.min(l,r)+1;
        }
        
        
    }   
    
}