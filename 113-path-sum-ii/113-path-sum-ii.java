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
    

    public static void pathSums(TreeNode root, int targetSum, ArrayList<Integer> a,List<List<Integer>> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                ArrayList<Integer> base = new ArrayList<>(a);
                base.add(root.val);
                ans.add(base);
            }
            return;
        }
        a.add(root.val);
        pathSums(root.left, targetSum - root.val, a, ans);

        pathSums(root.right, targetSum - root.val, a, ans);
        a.remove(a.size() - 1);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> a = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        pathSums(root, targetSum, a, ans);
        return ans;
    }
}
