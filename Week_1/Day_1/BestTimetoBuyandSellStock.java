class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int lp=prices[0];
        int p= 0;
      
        for(int i=0;i<n-1;i++){
            if(lp>prices[i]) {
                lp=prices[i];
                }
                if((prices[i+1]-lp)>p) p=prices[i+1]-lp;
        }
        return p;
    }
}
