class ReverseList{

    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }
    
    public ListNode reverse(ListNode head, ListNode newhead){
        if(head == null) return newhead;
        ListNode next = head.next;
        head.next = newhead;
        return reverse(next,head);
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head;
        ListNode reversehead = null;
        while(current.next != null){
            ListNode temp = current.next;
            current.next = reversehead;
            reversehead = current;
            current = temp;
        }
        
        current.next = reversehead;
        reversehead = current;
        return reversehead;
    }
}