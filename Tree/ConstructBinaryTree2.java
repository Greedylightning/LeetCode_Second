class ConstructBinaryTree2{

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(0, inorder.length - 1, 0, postorder.length - 1, inorder, postorder);
    }
    
    public TreeNode helper(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder){
        if(postStart > postEnd || inEnd < inStart) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == root.val) index = i;
        }
        root.left = helper(inStart, index - 1, postStart, postStart + index - inStart - 1, inorder, postorder);
        root.right = helper(index + 1, inEnd, postEnd - inEnd + index, postEnd - 1, inorder, postorder);
        
        return root;
    }
}