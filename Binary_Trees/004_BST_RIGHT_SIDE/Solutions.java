class Solution {
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
      
      if(root == null){
        return ans;
      }

      q.offer(root);

      while(! q.isEmpty()){
        int size = q.size();
        for(int i = 1 ;i<= size ; i++){
            TreeNode node = q.poll();

            if(i == size){
                ans.add(node.val);
            }
            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right != null){
                q.offer(node.right);
            }

       
        }
      }

        return ans;
    }
}
