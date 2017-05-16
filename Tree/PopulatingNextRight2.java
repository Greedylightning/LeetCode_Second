class PopulatingNextRight2{

     public void connect(TreeLinkNode root) {
        
        while(root != null){
            TreeLinkNode temp = new TreeLinkNode(0);
            TreeLinkNode currentChild = temp;
            while(root != null){
                if(root.left != null){currentChild.next = root.left; currentChild = currentChild.next;}
                if(root.right != null){currentChild.next = root.right; currentChild = currentChild.next;}
                root = root.next;
            }
            root = temp.next;
        }
    }
}