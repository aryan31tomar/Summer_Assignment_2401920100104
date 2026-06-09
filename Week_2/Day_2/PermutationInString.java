class Solution {
    boolean isequal(int freq[],int widfreq[]){
        for(int i=0;i<26;i++){
            if(freq[i]!=widfreq[i]) return false;
        }
        return true;

    }
    public boolean checkInclusion(String s1, String s2) {
        int freq[]=new int [26];
        for(int i=0;i<s1.length();i++){
            int idx=(int)s1.charAt(i)-97;
            freq[idx]++;
        }
        int widsize=s1.length();
        for(int i=0;i<s2.length();i++){
            int wididx=0,idx=i;
            int widfreq[]=new int[26];
            while(wididx<widsize&&idx<s2.length()){
                int j=(int)s2.charAt(idx)-97;
                widfreq[j]++;
                wididx++;
                idx++;
            }
            if(isequal(freq ,widfreq)) return true;
        }
        return false;
    }
}
