class BinaryTreeLevelOrder{

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subresult = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return result;
        queue.add(root);
        int queueSize = 1;
        subresult.add(root.val);
        result.add(subresult);
        while(queue.size() > 0){
            subresult = new ArrayList<>();
            for(int i = 0; i < queueSize; i++){
                TreeNode temp = queue.remove();
                if(temp.left != null){
                    queue.add(temp.left);
                    subresult.add(temp.left.val);
                    
                }
                if(temp.right != null){
                    queue.add(temp.right);
                    subresult.add(temp.right.val);
                }
            }
            if(!subresult.isEmpty())result.add(subresult);
            queueSize = queue.size();
        }
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        for(int i = result.size() - 1; i >= 0; i--){
            temp.add(result.get(i));
        }
        return temp;
    }
}