class Solution {
    static int maxsum;
    int levels(TreeNode root){
         if(root==null) return 0;
         int leftsum=Math.max(0, levels(root.left));
         int rightsum=Math.max(0, levels(root.right));
         int sum=leftsum+rightsum+root.val;
         maxsum=Math.max(maxsum,sum);
         return root.val + Math.max(leftsum, rightsum);
    }
    public int maxPathSum(TreeNode root) {
         maxsum = Integer.MIN_VALUE;
        levels(root);
        return maxsum;
    }
}
