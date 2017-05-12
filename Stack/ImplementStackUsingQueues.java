class ImplementStackUsingQueues{

    private Queue<Integer> queue;
    private Queue<Integer> temp;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
        temp = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(queue.size() > 1){
            temp.add(queue.remove());
        }
        int val = queue.remove();
        while(temp.size() > 0){
            queue.add(temp.remove());
        }
        return val;
    }
    
    /** Get the top element. */
    public int top() {
        while(queue.size() > 1){
            temp.add(queue.remove());
        }
        int val = queue.remove();
        while(temp.size() > 0){
            queue.add(temp.remove());
        }
        queue.add(val);
        return val;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }
}