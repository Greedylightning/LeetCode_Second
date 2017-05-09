class SortList{

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1, l2);
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode l = new ListNode(0);
        ListNode current = l;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;
        }
        
        while(l1 != null){
            current.next = new ListNode(l1.val);
            l1 = l1.next;
            current = current.next;
        }
        
        while(l2 != null){
            current.next = new ListNode(l2.val);
            l2 = l2.next;
            current = current.next;
        }
        return l.next;
    }
}