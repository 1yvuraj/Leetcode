class Solution {
    int main = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        main = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        help1(root, root.val, targetSum, map);
        return main;
    }

    public void help1(TreeNode root, int sum, int targetSum, HashMap<Integer, Integer> map) {
        if (root == null) return;
        if (map.containsKey(sum - targetSum)) {
            main+=map.get(sum - targetSum);
        }
        if (map.containsKey(sum)) {
            map.put(sum, map.get(sum) + 1);
        } else {
            map.put(sum, 1);
        }
        if(root.left!=null)
        help1(root.left, sum + root.left.val,targetSum, map);
        if(root.right!=null)
        help1(root.right, sum + root.right.val,targetSum, map);
        if (map.get(sum) == 1) {
            map.remove(sum);
        } else {
            map.put(sum, map.get(sum) - 1);
        }
    }
}
