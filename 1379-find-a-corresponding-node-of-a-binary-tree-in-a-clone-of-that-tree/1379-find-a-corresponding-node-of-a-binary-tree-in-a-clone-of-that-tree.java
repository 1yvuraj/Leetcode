class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null || cloned == null)
            return null;
        if(original == target) 
            return cloned;
        else{
            TreeNode left =  getTargetCopy(original.left,cloned.left,target);
            if(left!=null) // if it found the target in the left side
                return left;
            else
                // go to find in the right side
                return getTargetCopy(original.right,cloned.right,target);
        }
    }
}

// If you liked please vote-up:)