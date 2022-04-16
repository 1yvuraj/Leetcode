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
    int dfs(TreeNode node, int toAdd) {
    if (node == null)
            return toAdd;

        node.val += dfs(node.right, toAdd);
        return dfs(node.left, node.val);
    }

    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);

        return root;

    }
}