// class Solution {
//     public int countNodes(TreeNode root) {
//         if(root==null)return 0;
//         TreeNode ln=root.left;
//         int lnc=0;
//         while(ln!=null)
//         {
//             ln=ln.left;
//             lnc++;

//         }
//          TreeNode rn=root.right;
//         int rnc=0;
//         while(rn!=null)
//         {
//             rn=rn.right;
//             rnc++;

//         }
//         if(rnc==lnc)return (1<<(lnc+1))-1;
//         else return countNodes(root.left)+countNodes(root.right)+1;
//     }
// }
class Solution {
    int ans = 0;

    public int countNodes(TreeNode root) {
        help(root);
        return ans;
    }
    public void help(TreeNode root) {
        if (root == null) return;
        ans++;
        help(root.left);
        help(root.right);
    }
}
