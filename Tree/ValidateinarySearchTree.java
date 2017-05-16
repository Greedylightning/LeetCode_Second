class ValidateBinarySearchTree{

    List<Integer> temp = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        helper(root);
        for(int i = 0; i < temp.size() - 1;i++){
            if(temp.get(i) >= temp.get(i + 1)) return false;
        }
        return true;
    }
    
    public void helper(TreeNode root){
        if(root == null) return ;
        helper(root.left);
        temp.add(root.val);
        helper(root.right);
    }
}