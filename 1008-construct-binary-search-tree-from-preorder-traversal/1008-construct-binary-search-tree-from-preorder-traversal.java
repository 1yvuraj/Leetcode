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
    int idx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return help(preorder, -(int) 1e9, (int) 1e9);
    }
    public TreeNode help(int[] preorder, int si, int e) {
        if (idx == preorder.length) {
            return null;
        } else if (preorder[idx] > si && preorder[idx] < e) {
            TreeNode node = new TreeNode(preorder[idx]);
            idx++;
            node.left = help(preorder, si, node.val);
            node.right = help(preorder, node.val, e);
            return node;
        } else {
            return null;
        }
    }
}
