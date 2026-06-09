class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxl=0;
        int i=0,j=0;
            while(j<s.length()){
                char c=s.charAt(j);
                if(!set.contains(c)){
                    set.add(c);
                    j++;
                    continue;
                } 
                else {
                    int l=j-i;
                    maxl=Math.max(maxl,l);
                    while(s.charAt(i)!=s.charAt(j)){
                       set.remove(s.charAt(i));
                       i++;
                    }
                    
                }
                i++;
                j++;
            }
            int len=j-i;
            maxl=Math.max(maxl,len);
        return maxl;
    }
}
