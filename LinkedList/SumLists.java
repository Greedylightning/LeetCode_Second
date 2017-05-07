class SumLists{

    public Node sum(Node p, Node q){
        Node beginresult = null;
        Node endresult = null;
        boolean carry = false;
        while(p.next != null && q.next != null){
            if(p.val + q.val + carry >= 10){
                if(beginresult == null){
                    beginresult = new Node(p.val + q.val + carry - 10);
                    endresult = beginresult;
                    carry = true;
                }
                else{
                    endresult.next = new Node(p.val + q.val + carry - 10);
                    endresult = endresult.next;
                    carry = true;
                }
            }
            else{
                if(beginresult == null){
                    beginresult = new Node(p.val + q.val + carry);
                    endresult = beginresult;
                    carry = false;
                }
                else{
                    endresult.next = new Node(p.val + q.val + carry);
                    endresult = endresult.next;
                    carry = false;
                }
            }
            p = p.next;
            q = q.next;
        }
        while(p.next != null){
            if(p.val + carry >= 10){
                endresult.next = new Node(p.val + carry - 10);
                endresult = endresult.next;
                carry = true;
            }
            else{
                endresult.next = new Node(p.val + carry);
                endresult = endresult.next;
                carry = false;
            }
            p = p.next;
        }
        while(q.next != null){
            if(q.val + carry >= 10){
                endresult.next = new Node(q.val + carry - 10);
                endresult = endresult.next;
                carry = true;
            }
            else{
                endresult.next = new Node(p.val + carry);
                endresult = endresult.next;
                carry = false;
            }
            q = q.next;
        }

        if(carry) endresult.next = new Node(1);
        endresult = endresult.next;

        return beginresult;
    }
}