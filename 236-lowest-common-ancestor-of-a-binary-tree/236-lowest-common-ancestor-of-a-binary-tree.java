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
    TreeNode node=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lowest(root,p,q);
        return node;
    }
    public boolean lowest(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return false;
        boolean self=(root==p)||(root==q);
        boolean l=lowest(root.left,p,q);
        if(node!=null)return true;
        boolean r=lowest(root.right,p,q);
        if(node!=null)return true;
        
       if(self && l||r&& self||l&&r)
       {
           node=root;
       }
        return self||l||r;
        
        
    }
}