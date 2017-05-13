class BinaryTreeTilt{

    int value = 0;
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        sumAll(root);
        return value;
    }

    public int sumAll(TreeNode root){
        if(root == null) return 0;
        
        int left = sumAll(root.left);
        int right = sumAll(root.right);
        value = value + Math.abs(left - right);
        
        return left + right + root.val;
    }
}