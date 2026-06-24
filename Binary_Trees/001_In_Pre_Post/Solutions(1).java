/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    private void inOrder(TreeNode root,List<Integer> in){
     if(root == null){
        return ;
        
     }
     inOrder(root.left , in);
        in.add(root.data);
        inOrder(root.right , in);
    }
private void preOrder(TreeNode root , List<Integer> pre){
        if(root == null){
        return ;
        
     }
     pre.add(root.data);
     preOrder(root.left , pre);
        
        preOrder(root.right , pre);
    }
    private void postOrder(TreeNode root , List<Integer> post){
         if(root == null){
        return ;
        
     }
         
         postOrder(root.left , post);
         postOrder(root.right , post);
         post.add(root.data );
    }
    List<List<Integer>> treeTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

         inOrder(root,in);
        preOrder(root,pre);
        postOrder(root,post);

        ans.add(in);
        ans.add(pre);
        ans.add(post);

       

        return ans;
    }
}
