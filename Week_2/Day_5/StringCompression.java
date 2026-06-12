class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        String ans="";
        int i=0,j=0;
        while(j<n){
            if(chars[i]==chars[j]) j++;
            else 
            {
                ans+=chars[i];
                if(j-i>1) ans+=(j-i);
                i=j;
            }
        }
         ans += chars[i];
        if (j - i > 1) {
            ans += (j - i);
        } 
         char res[]=ans.toCharArray();
        for(int k=0;k<res.length;k++){
            chars[k]=res[k];

        }

        return res.length;
    }
}
