class BinaryTreeRightSideView{

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return result;
        queue.add(root);
        result.add(root.val);
        int queueSize = 1;
        while(queue.size() > 0){
            for(int i = 0; i < queueSize; i++){
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            
            if(queue.size() > 0)result.add(queue.get(queue.size() - 1).val);
            queueSize = queue.size();
        }
        return result;
    }
}