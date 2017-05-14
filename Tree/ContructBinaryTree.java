class ConstructBinaryTree{

   public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);
    }
    
    public TreeNode helper(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == root.val) index = i;
        }
        root.left = helper(preStart + 1, preStart + index - inStart, inStart, index - 1, preorder, inorder);
        root.right = helper(preEnd + index + 1 - inEnd, preEnd, index + 1, inEnd, preorder, inorder);
        return root;
    }
}