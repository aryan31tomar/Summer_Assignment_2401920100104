class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        String newstr=""; 
        String rev="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65&&ascii<=90){
               ch=Character.toLowerCase(ch);
                newstr=newstr+ch;
                rev=ch+rev;
            }
            else if(ascii>=97&&ascii<=122||ascii>=48&&ascii<=57) {
                newstr=newstr+ch;
                rev=ch+rev;
            }
            
            else {
               continue;
            }

        }
        if(newstr.equals(rev)) return true;
        else return false;
    }
}
