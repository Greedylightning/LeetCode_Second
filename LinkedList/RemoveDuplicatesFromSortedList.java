class RemoveDuplicatesFromSortedList{

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode pre = newhead;
        ListNode cur = head;
        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if(pre.next == cur) pre = pre.next;
            else pre.next = cur.next;
            cur = cur.next;
        }
        return newhead.next;
    }
}