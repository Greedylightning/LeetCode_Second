class Partition{

    public void partList(Node head, int val){
        Node beginleft = null;
        Node endleft = null;
        Node beginright = null;
        Node endright = null;

        Node current = head;

        while(current.next != null){
            if(current.val < val){
                if(beginleft == null){
                    beginleft = new Node(current.val);
                    endleft = beginleft;
                }
                else{
                    endleft.next = new Node(current.val);
                    endleft = endleft.next;
                }
            }
            else {
               if(beginright == null){
                    beginright = new Node(current.val);
                    endright = beginright;
                }
                else{
                    endright.next = new Node(current.val);
                    endright = endright.next;
                }
            }
            current = current.next;
        }

        endleft.next = beginright;
        return beginleft;
    }
}