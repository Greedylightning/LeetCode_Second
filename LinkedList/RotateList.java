class RotateList{

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode current = head;
        int length = 1;
        while(current.next != null){
            current = current.next;
            length++;
        }
        current.next = head;
        current = head;
        for(int i = 1; i < length - k % length; i++){
            current = current.next;
        }
        ListNode result = current.next;
        current.next = null;
        return result;
    }
}