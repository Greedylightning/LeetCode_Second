class RemoveDuplications{

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        while(head.val == val){
            
            if(head.next == null) return null;
            head = head.next;
        }
        ListNode current = head;
        ListNode previous = head;
        while(current != null){
            if(current.val == val){
                current = current.next;
                previous.next = current;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        return head;
    }
}