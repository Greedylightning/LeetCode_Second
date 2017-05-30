class UniqueBinarySearchTrees{

    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<>();
        return helper(1, n);
        
    }
    
    public List<TreeNode> helper(int begin, int end){
        
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(begin > end){
            result.add(null);
            return result;
        }
        if(begin == end){
            result.add(new TreeNode(begin));
            return result;
        }
        
        List<TreeNode> left, right;
        for(int i = begin; i <= end; i++){
            left = helper(begin, i - 1);
            right = helper(i + 1, end);
            for(TreeNode lnode : left){
                for(TreeNode rnode : right){
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}