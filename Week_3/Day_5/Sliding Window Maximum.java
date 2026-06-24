class Solution {
    public class Pair implements Comparable<Pair>{
        int ele,idx;
        Pair(int ele, int idx){
            this.ele=ele;
            this.idx=idx;
        }
        public int compareTo(Pair p){
             return this.ele-p.ele;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
           if (nums == null || nums.length == 0 || k <= 0)
            return new int[0];
        int n=nums.length; 
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> l = new ArrayList<>();
        
        
        
            int j=0,a=0;
            while(j<n){
                pq.add(new Pair(nums[j],j));
                while (!pq.isEmpty() && pq.peek().idx <= j - k) {
                pq.poll();
                }
                if (j >= k - 1) {
                l.add(pq.peek().ele);
            }
                j++;
            }
            
        
        int ans[] = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}
