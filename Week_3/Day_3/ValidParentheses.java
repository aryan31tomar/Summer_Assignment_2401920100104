class Solution {
    public boolean isValid(String s) {

        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']') return false;

        int n=s.length();
        Stack<Character> st=new Stack<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;

                char ch=st.peek();

                if((ch=='('&&c==')')||(ch=='{'&&c=='}')||(ch=='['&&c==']')){
                    st.pop();
                }
                else return false;
            }
        }

        return st.isEmpty();
    }
}
