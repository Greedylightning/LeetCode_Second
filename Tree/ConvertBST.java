class ConvertBST{
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        //if(root == null) return ;
        convert(root);
        return root;
    }
    
    public void convert(TreeNode root){
        if(root == null) return ;
        convert(root.right);
        root.val += sum;
        sum = root.val;
        convert(root.left);
    }
}