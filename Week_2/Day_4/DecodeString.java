class Solution {
    public String decodeString(String s) {
        Stack<Integer> countst = new Stack<>();
        Stack<StringBuilder > stringst = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num=0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch))   num = num * 10 + (ch - '0');
            else if(ch=='['){
                countst.push(num);
                stringst.push(sb);
                num = 0;
                sb = new StringBuilder();
            }
            else if(ch==']'){
                int repeat=countst.pop();
                StringBuilder pre=stringst.pop();
                for(int i=0;i<repeat;i++){
                    pre.append(sb);
                }
                sb=pre;
            }
            else{
                sb.append(ch);
            }
        }
            return sb.toString();
    }
}
