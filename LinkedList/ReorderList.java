class ReorderList{

    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null) return ;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode middle = slow;
        ListNode current = slow.next;
        
        while(current.next != null){
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = middle.next;
            middle.next = temp;
        }
        
        ListNode p1 = head;
        ListNode p2 = middle.next;
        
        while(p1 != middle){
            middle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=middle.next;
        }
    }
}