import java.util.Set;

class RemoveDups{

    public Node removeDups(Node head){
        if(head == null || head.next == null) return head;
        Set<Integer> set = new HashSet<Integer>();
        Node current = head;
        set.add(current.val);
        while(current.next != null){
            if(set.contains(current.next.val)) current.next = current.next.next;
            else{
                set.add(current.next.val);
                current = current.next;
            }

        }

        return head;
    }

    public Node removeDups(Node head){
        if(head == null || head.next == null) return head;
        Node current = head;
        while(current.next != null){
            Node temp = current.next;
            while(temp.next != null){
                if(temp.val < current.val){
                    int v = temp.val;
                    temp.val = current.val;
                    current.val = v;
                }
                temp = temp.next;
            }
            if(temp.val < current.val){
                int v = temp.val;
                temp.val = current.val;
                current.val = v;
            }
            current = current.next;
        }

        Node current = head;
        while(current.next != null){
            if(current.val == current.next.val) current.next = current.next.next;
            else current = current.next;
        }
    }
}