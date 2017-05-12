class BinaryTreeSearch{

    public void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            visit(root);
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root){
        if(root != null){
            visit(root);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            visit(root);
        }
    }
}