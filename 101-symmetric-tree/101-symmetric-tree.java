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
    public boolean isSymmetric(TreeNode node) {
        return isSameTree(node.right, node.left);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null) return false;
        if (q == null) return false;
        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left)&&(p.val==q.val);
    }
    
}
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         if(root==null) return true;
//         return check(root.left, root.right);
//     }
//     boolean check(TreeNode a, TreeNode b){
//         if(a==null && b==null) return true;
//         if(a==null || b==null) return false;
//         if(a.val != b.val) return false;
//         return check(a.left, b.right) && check(a.right, b.left);
//     }
// }
