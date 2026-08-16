class MinStack {
    Stack<Integer> minstack = new Stack<>();
    Stack<Integer> valuestack = new Stack<>();

    public MinStack() {
        minstack = new Stack<>();
        valuestack = new Stack<>();
        
    }
    
    public void push(int value) {
        valuestack.push(value);
        if(minstack.isEmpty())
        {
            minstack.push(value);
        }
        else
        {
        int mintop=minstack.peek();
        if(value<mintop)
        {
            minstack.push(value);
        }
        else
        {
            minstack.push(mintop);
        }
            
        }
    }
    
    public void pop() {
        minstack.pop();
        valuestack.pop();
    }
    
    public int top() {
        return valuestack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */