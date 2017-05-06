class DeleteMiddleNode{

    public void deleteMiddleNode(Node n){
        n.val = n.next.val;
        n.next = n.next.next;
    }
}