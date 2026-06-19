class MyQueue {
    Stack<Integer> st ;
    Stack<Integer> temp;
    public MyQueue() {
       st = new Stack<>();
       temp = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1) temp.push(st.pop());
        int top=st.pop();
        while(temp.size()!=0) st.push(temp.pop());
        return top;
    }
    
    public int peek() {
         while(st.size()>1) temp.push(st.pop());
        int top=st.peek();
        while(temp.size()!=0) st.push(temp.pop());
        return top;
        
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}
