class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.equals("+")){
                int arg1=st.pop();
                int arg2=st.pop();
                st.push(arg2+arg1);
            }
            else if( s.equals("-")){
                int arg1=st.pop();
                int arg2=st.pop();
                st.push(arg2-arg1);
            }
             else if(s.equals("*")){
                int arg1=st.pop();
                int arg2=st.pop();
                st.push(arg2*arg1);
            }
             else if(s.equals("/")){
                int arg1=st.pop();
                int arg2=st.pop();
                st.push(arg2/arg1);
            }
            else   st.push(Integer.parseInt(s));
        }
        return st.peek();
    }
}
