class Solution {
    static List<String> l;
    public void paren(int open,int close,int n,String s){
        if(s.length()==2*n){
            l.add(s);
            return;
        }
        if(open<n) paren(open+1,close,n,s+"(");
        if(close<open) paren(open,close+1,n,s+")");

    }
    public List<String> generateParenthesis(int n) {
        l=new ArrayList<>();
        paren(0,0,n,"");
        return l;
    }
}
