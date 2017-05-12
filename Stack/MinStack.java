class MinStack{

    private Stack<Integer> stack;
    private Stack<Integer> temp;
    private int min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        temp = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x < min) min = x;
        stack.push(x);
    }
    
    public void pop() {
        int val = stack.pop();
        if(val == min){
            min = Integer.MAX_VALUE;
            setMin();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
    
    private void setMin(){
        while(stack.size() > 0){
            int val = stack.pop();
            min = Math.min(min, val);
            temp.push(val);
        }
        while(temp.size() > 0){
            stack.push(temp.pop());
        }
    }
}