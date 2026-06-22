class Solution {
    public int depth(TreeNode root,int count){
        if(root==null) return count;
        int left =depth(root.left,count+1);
        int right=depth(root.right,count+1);
        return Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        int ans=depth(root,0);
        return ans;
    }
}
