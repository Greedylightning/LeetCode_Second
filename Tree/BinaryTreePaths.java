class BinaryTreePaths{

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        backtrack(result, new String(), root);
        return result;
    }
    
    public void backtrack(List<String> result, String subresult, TreeNode root){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            result.add(subresult + root.val);
            return ;
        }
        subresult += root.val;
        backtrack(result, subresult + "->", root.left);
        backtrack(result, subresult + "->", root.right);
        
    }
}