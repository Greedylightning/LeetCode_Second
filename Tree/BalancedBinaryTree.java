class BalancedBinaryTree{

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        
        int diff = Math.abs(left - right);
        if(diff > 1) return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int getDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}