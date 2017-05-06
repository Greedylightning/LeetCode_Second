class Node{

    private Node next;
    int val;

    public Node(){
        next = null;
    }

    public Node(int val){
        this.val = val;
        next = null;
    }

    public void appendToTail(int val){
        Node end = new Node(val);
        Node cur = this;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = end;
    }

    public Node appendToHead(int val){
        Node head = Node(val);
        head.next = this;
        return head;
    }

    public Node deleteNode(Node head, int val){

        Node cur = head;

        if(cur.val == val) return head.next;

        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

        return head;
    }
}