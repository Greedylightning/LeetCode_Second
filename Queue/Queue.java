import java.util.NoSuchElementException;

class Queue<T>{

    private static class Node<T>{
        private T val;
        private Node<T> next;

        public Node(T val){
            this.val = val;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void add(T item){
        Node<T> temp = new Node<T>(item);
        if(last != null) last.next = temp;
        last = temp;
        if(first == null) first = last;
    }

    public T remove(){
        if(first == null) throw new NoSuchElementException();
        T val = first.val;
        first = first.next;
        if(first == null) last = null;
        return val;
    }

    public T peek(){
        if(first == null) throw new NoSuchElementException();
        return first.val;
    }

    public boolean isEmpty(){return first == null;}
}