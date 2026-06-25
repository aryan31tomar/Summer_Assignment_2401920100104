class Solution {
    static int maxdia;
    int levels(TreeNode root){
         if(root==null) return 0;
         int leftlevel=levels(root.left);
         int rightlevel=levels(root.right);
         int dia=leftlevel+rightlevel;
         maxdia=Math.max(maxdia,dia);
         return 1+Math.max(leftlevel,rightlevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxdia=0;
        levels(root);
        return maxdia;
    }
}
