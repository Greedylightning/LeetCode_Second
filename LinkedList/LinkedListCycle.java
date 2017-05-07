class LinkedListCycle{

    public boolean hasCircle(ListNode head){
        if(head == null || head.next == null) return false;
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode current = head;
        while(current.next != null){
            if(set.contains(current)) return true;
            else{
                set.add(current);
                current = current.next;
            }
        }
        return false;
    }

    public boolean hasCircle(ListNode head){

        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}