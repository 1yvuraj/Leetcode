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
    int dh=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
    
        diameterOfBinary(root);

        return dh; 
    }
    public  int diameterOfBinary(TreeNode root) {
    if(root==null){
        return -1;
    }
    int l=diameterOfBinary(root.left);
    int r=diameterOfBinary(root.right);
    
    dh=Math.max(dh,l+r+2);
    
    return Math.max(l,r)+1;
  }

}