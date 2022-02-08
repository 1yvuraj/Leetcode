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
// class Solution {

//     public static class pair {
//         TreeNode node;
//         int idx;

//         pair(TreeNode node, int idx) {
//             this.node = node;
//             this.idx = idx;
//         }
//     }

//      static int max = 0;

//     public int widthOfBinaryTree(TreeNode root) {
//         LinkedList<pair> q = new LinkedList<>();
//         q.addLast(new pair(root, 0));
//         while (q.size() != 0) {
//             int size = q.size();
//             int lm = q.getFirst().idx;
//             int rm = q.getFirst().idx;
//             while (size-- > 0) {
//                 pair r = q.removeFirst();
//                 rm = r.idx;
//                 if (r.node.left != null) {
//                     q.add(new pair(r.node.left, 2 * r.idx + 1));
//                 }
//                 if (r.node.right != null) {
//                     q.add(new pair(r.node.right, 2 * r.idx + 2));
//                 }
//             }
//             max = Math.max(max, (rm) - (lm) + 1);
//         }
//         return max;
//     }
// }
class Solution {
    public class pair {
        TreeNode node = null;
        long w = 0;
        pair(TreeNode node, long w) {
            this.node = node;
            this.w = w;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<pair> que = new LinkedList<>();
        que.addLast(new pair(root, 1));
        int ans = 0;
        while (que.size() != 0) {
            int size = que.size();
            long fi = que.getFirst().w;
            long li = que.getFirst().w;
            while (size-- > 0) {
                pair p = que.removeFirst();
                TreeNode node = p.node;
                long w = p.w;
                li = w;
                if (node.left != null){
                    que.addLast(new pair(node.left, 2 * w+1));
                }
                if (node.right != null){
                    que.addLast(new pair(node.right, 2 * w + 2));
                }
            }
            ans = Math.max(ans, (int) (li - fi + 1));
        }
        return ans;
    }
}
