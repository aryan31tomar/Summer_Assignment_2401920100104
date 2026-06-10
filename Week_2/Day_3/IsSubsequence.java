class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.equals(t)) return true;
        int i=0,j=0;
        while(i<t.length())
        {
            if(j<s.length()&&s.charAt(j)==t.charAt(i)){
                j++;
            }
            i++;
        }
       
        return j==s.length();
    }
}
