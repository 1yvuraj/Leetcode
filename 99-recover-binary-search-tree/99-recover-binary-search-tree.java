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

    public static TreeNode ok(TreeNode temp, TreeNode p) {
        while (temp.right != null && temp.right != p) {
            temp = temp.right;
        }
        return temp;
    }

    public static void recoverTree(TreeNode root) {
        TreeNode cur = root, p = null, a = null, b = null;

        while (cur != null) {
            TreeNode temp = cur.left;
            if (temp == null) {
                if (p != null && p.val > cur.val) {
                    if (a == null) {
                        a = p;
                    }
                    b = cur;
                }
                p = cur;
                cur = cur.right;
            } else {
                TreeNode leftmostnode = ok(temp, cur);
                if (leftmostnode.right != cur) {
                    leftmostnode.right = cur;
                    cur = cur.left;
                } else {
                    leftmostnode.right = null;
                    if (p != null && p.val > cur.val) {
                        if (a == null) {
                            a = p;
                        }
                        b = cur;
                    }
                    p = cur;
                    cur = cur.right;
                }
            }
        }
        if (a != null) {
            int temp = a.val;
            a.val = b.val;
            b.val = temp;
        }
    }
}
