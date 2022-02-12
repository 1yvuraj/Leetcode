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
    ArrayList<Integer>ans=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        help(root,k,0);
       
        return ans.get(k-1);
    }
    public void help(TreeNode root, int k,int d) {
        if(root==null)return;
        
        help(root.left,k-1,d);
        ans.add(root.val);
        help(root.right,k-1,d);
        
    }
}