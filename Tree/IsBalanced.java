class IsBalanced{

    public int getHeight(TreeNode root){
        if(root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root){
        if(root == null) return true;
        int leftDepth = getHeight(root.left);
        int rightDepth = getHeight(root.right);
        int diff = Math.abs(leftDepth - rightDepth);
        if(diff > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
}