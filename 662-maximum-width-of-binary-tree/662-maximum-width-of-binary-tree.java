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

    public static class pair {
        TreeNode node;
        int idx;

        pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<pair> q = new LinkedList<>();
        int ans=0;
        q.addLast(new pair(root, 0));
        while (q.size() != 0) {
            int size = q.size();
            int lm = q.getFirst().idx;
            int rm = q.getFirst().idx;
            while (size-- > 0) {
                pair r = q.removeFirst();
                rm = r.idx;
                if (r.node.left != null) {
                    q.add(new pair(r.node.left, 2 * r.idx + 1));
                }
                if (r.node.right != null) {
                    q.add(new pair(r.node.right, 2 * r.idx + 2));
                }
            }
            ans = Math.max(ans, (rm) - (lm) + 1);
        }
        return ans;
    }
}
