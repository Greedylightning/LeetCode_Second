class Successor{

    TreeNode inorderSucc(TreeNode root){
        if(root == null) return null;
        if(root.right != null) return leftMostChild(root.right);
    }

    TreeNode leftMostChild(TreeNode root){
        if(root == null) return null;
        while(root.left != null) root = root.left;
        return root;
    }
}