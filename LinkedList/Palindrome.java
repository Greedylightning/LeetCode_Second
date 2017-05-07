class Palindrome{

    public boolean palindrome(Node head){
        Node current = head;
        Node reversehead = null;

        while(current.next != null){
            Node temp = current.next;
            current.next = reversehead;
            reversehead = current;
            current = temp;
        }

        current.next = reversehead;

        reversehead = current;


        while(head.next != null && reversehead.next != null){
            if(head.val != reversehead.val) return false;
            head = head.next;
            reversehead = reversehead.next;
        }

        if(head.next != null) return false;
        if(reversehead.next != null) return false;

        return true;
    }
}