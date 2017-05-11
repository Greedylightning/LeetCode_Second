class RemoveNodeFromEnd{

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next == null && n == 1)) return null;
        int length = 0;
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        current = head;
        if(length == n) return current.next;
        for(int i = 1; i < length - n; i++) current = current.next;
        if(current.next != null){
            current.next = current.next.next;
            return head;
        }
        else return current;
    }
}