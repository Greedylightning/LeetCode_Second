class SumRootToLeafNumbers{

    int value = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        backtrack(root, new String());
        return value;
    }
    
    public void backtrack(TreeNode root, String subresult){
        if(root == null) return ;
        subresult += root.val;
        if(root.left == null && root.right == null){
            value += Integer.parseInt(subresult);
        }
        backtrack(root.left, subresult);
        backtrack(root.right, subresult);
        subresult = subresult.substring(0, subresult.length() - 1);
    }
}