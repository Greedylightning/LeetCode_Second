class ImplementQueueUsingStack{

    private Stack<Integer> stack;
    private Stack<Integer> temp;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<Integer>();
        temp = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(stack.size() > 1){
            temp.push(stack.pop());
        }
        int val = stack.pop();
        while(temp.size() > 0){
            stack.push(temp.pop());
        }
        return val;
    }
    
    /** Get the front element. */
    public int peek() {
        while(stack.size() > 1){
            temp.push(stack.pop());
        }
        int val = stack.pop();
        temp.push(val);
        while(temp.size() > 0){
            stack.push(temp.pop());
        }
        return val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.size() == 0;
    }
}