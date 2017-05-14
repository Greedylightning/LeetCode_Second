class PathSum{

    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        backtrack(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return count;
    }
    
    public void backtrack(TreeNode root, int sum){
        if(root == null) return ;
        if(sum == root.val){
            count++;
            //return ;
        }
        backtrack(root.left, sum - root.val);
        backtrack(root.right, sum - root.val);
    }
}