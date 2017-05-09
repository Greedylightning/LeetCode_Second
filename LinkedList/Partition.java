class Partition{

    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode beginleft = null;
        ListNode endleft = null;
        ListNode beginright = null;
        ListNode endright = null;
        
        ListNode current = head;
        
        while(current != null){
            if(current.val < x){
                if(beginleft == null){
                    beginleft = new ListNode(current.val);
                    endleft = beginleft;
                }
                else{
                    endleft.next = new ListNode(current.val);
                    endleft = endleft.next;
                }
            }
            else {
               if(beginright == null){
                    beginright = new ListNode(current.val);
                    endright = beginright;
                }
                else{
                    endright.next = new ListNode(current.val);
                    endright = endright.next;
                }
            }
            current = current.next;
        }
        
        if(endleft != null){
            endleft.next = beginright;
            return beginleft;
        }
        else return beginright;
    }
}