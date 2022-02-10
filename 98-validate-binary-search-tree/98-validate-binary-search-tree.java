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
      long pr=Long.MIN_VALUE;
    
    public  boolean isValidBST(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        if(!isValidBST(root.left))return false;
        if(pr!=Long.MIN_VALUE-1 && pr>=root.val)return false;
        pr=root.val;
        if(!isValidBST(root.right))return false;
        return true;
    }
}