import java.util.EmptyStackException;

class Stack<T>{

    private static class Node<T>{
        private T val;
        private Node<T> next;

        public Node(T val){
            this.val = val;
        }
    }

    private Node<T> top;

    public T pop(){
        if(top == null) throw new EmptyStackException();
        T item = top.val;
        top = top.next;
        return item;
    }

    public void push(T item){
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }

    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.val;
    }

    public boolean isEmpty(){
        return top == null;
    }
}