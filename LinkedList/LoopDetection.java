class LoopDetection{

    public Node findStart(Node head){

        Node temp = hasCircle(head);
        int circlelength = 1;
        if(temp != null){
            Node begin = temp;
            while(temp.next != begin){
                circlelength++;
                temp = temp.next;
            }
            Node p1 = head;
            Node p2 = head;
            for(int i = 0; i < circlelength; i++) p1 = p1.next;
            while(p1.next != null && p2.next!= null){
                if(p1 == p2) return p1;
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        else return null;
    }

    public Node hasCircle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next.next != null){
            if(slow == fast) return slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return null;
    }
}