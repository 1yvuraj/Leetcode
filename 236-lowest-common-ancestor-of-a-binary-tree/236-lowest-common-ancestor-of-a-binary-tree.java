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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       ArrayList<TreeNode> ans = nodeToRootPath(root, p);
        ArrayList<TreeNode> ans1 = nodeToRootPath(root, q);
        int i = ans.size() - 1;
        int j = ans1.size() - 1;
        while (i >= 0 && j >= 0 && ans.get(i) == ans1.get(j)) {
            i--;
            j--;
        }
        
        return ans.get(i+1);
    } 
    
    
    public  ArrayList<TreeNode> nodeToRootPath(TreeNode node, TreeNode data) {
        if (node == null) {
            return new ArrayList<>();
        }
        if (node == data) {
            ArrayList<TreeNode> root = new ArrayList<>();
            root.add(node);
            return root;
        }
        ArrayList<TreeNode> l = nodeToRootPath(node.left, data);
        if (l.size() > 0) {
            l.add(node);
            return l;
        }
        ArrayList<TreeNode> r = nodeToRootPath(node.right, data);
        if (r.size() > 0) {
            r.add(node);
            return r;
        }
        return new ArrayList<>();
    }

    
}

