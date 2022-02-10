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

    public List<TreeNode> allPossibleFBT(int n) {
        return help(n);
    }

    public List<TreeNode> help(int n) {
        if (n == 1) {
            List<TreeNode> a = new ArrayList<>();
            a.add(new TreeNode(0));
            return a;
        }
        List<TreeNode> ans = new ArrayList<>();
        for (int i = 1; i < n; i += 2) {
            List<TreeNode> l = help(i);
            List<TreeNode> r = help(n - i - 1);
            for (TreeNode Left : l) {
                for (TreeNode right : r) {
                    TreeNode root = new TreeNode(0);
                    root.left = Left;
                    root.right = right;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
