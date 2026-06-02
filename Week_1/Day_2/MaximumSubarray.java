class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE,cursum=0;
        for(int i=0;i<n;i++){
             cursum+=nums[i];
             maxsum=Math.max(maxsum,cursum);
             if(cursum<0) cursum=0;
        }
        return maxsum;
        
    }
}
