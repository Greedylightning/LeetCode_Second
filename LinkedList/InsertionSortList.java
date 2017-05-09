class InsertionSortList{

    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        
        while(first != null){
            while(second != null){
                if(second.val < first.val){
                    int temp = first.val;
                    first.val = second.val;
                    second.val = temp;
                }
                second = second.next;
            }
            first = first.next;
            second = first;
        }
        
        return head;
    }
}