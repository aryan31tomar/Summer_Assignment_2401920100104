class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int m=matrix.length;
       int n=matrix[0].length;
       List<Integer> ans = new ArrayList<>();
        int rmin=0;
        int rmax=m-1;
        int cmin=0;
        int cmax=n-1;
        while(rmin<=rmax&&cmin<=cmax){
            for(int i=cmin; i<=cmax; i++){
                ans.add(matrix[rmin][i]);
                
            }rmin++;
            if(rmin>rmax||cmin>cmax)break;
            for(int i=rmin; i<=rmax; i++){
                ans.add(matrix[i][cmax]);
                
            }cmax--;
            if(rmin>rmax||cmin>cmax)break;
            for(int i=cmax; i>=cmin; i--){
                ans.add(matrix[rmax][i]);
                
            }rmax--;
            if(rmin>rmax||cmin>cmax)break;
            for(int i=rmax; i>=rmin; i--){
                ans.add(matrix[i][cmin]);
                
            }cmin++;

        }
        return ans;
    }
}
