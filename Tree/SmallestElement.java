class SmallestElement{

    int count = 0;
    int number = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }
    
    public void helper(TreeNode root){
        if(root.left != null) helper(root.left);
        count--;
        if(count == 0) number = root.val;
        if(root.right != null) helper(root.right);
    }
}