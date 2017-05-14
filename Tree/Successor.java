class Successor{

    TreeNode inorderSucc(TreeNode root){
        if(root == null) return null;
        if(root.right != null) return leftMostChild(root.right);
        else{
            TreeNode current = root;
            TreeNode parent = root.parent;
            while(parent != null && parent.left != current){
                current = parent;
                parent = parent.parent;
            }
            return parent;
        }
    }

    TreeNode leftMostChild(TreeNode root){
        if(root == null) return null;
        while(root.left != null) root = root.left;
        return root;
    }
}