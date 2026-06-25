class Solution {
    private boolean validHelper(TreeNode root , long min, long max){
        if(root == null){
            return true;
        }
         if(root.val <= min || root.val >= max){
            return false;
         }

         return validHelper(root.left,min,root.val) && validHelper(root.right,root.val,max);

    }

    public boolean isValidBST(TreeNode root) {
        return validHelper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }


}
