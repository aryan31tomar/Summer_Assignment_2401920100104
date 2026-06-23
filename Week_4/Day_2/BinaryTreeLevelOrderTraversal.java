class Solution {
    int x;
    public int level(TreeNode root){
        if(root==null) return 0;
        return  1+Math.max(level(root.left),level(root.right));
    }
    public void traverse(TreeNode root,int n,List<Integer> l){
            
            if(root==null) return;
            if(n==x) l.add(root.val);
            traverse(root.left,n+1,l);
            traverse(root.right,n+1,l);

             
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl=level(root);
        for(int i=0;i<lvl;i++){
            List<Integer> l = new ArrayList<>();
            x=i;
             traverse(root,0,l);
             ans.add(l);
        }

        return ans;
       
    }
}
