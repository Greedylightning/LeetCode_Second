class KLastElement{

    public int getKLastElement(Node head, int k){
        int length = 0;
        Node current = head;
        while(current.next != null){
            length++;
        }

        int step = length - 1 - k;
        current = head;
        for(int i = 0; i < step; i++) current = current.next;

        return current.val;
    }

    public int getKLastElement(Node head, int k){
        Node p1 = head;
        for(int i = 0; i < k; i++) p1 = p1.next;
        Node p2 = head;
        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.val;
    }
}