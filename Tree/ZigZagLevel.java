class ZigZagLevel{

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return result;
        List<Integer> subresult = new LinkedList<Integer>();
        subresult.add(root.val);
        result.add(subresult);
        queue.add(root);
        int queueSize = 1;
        int flag = 2;
        while(queue.size() > 0){
            for(int i = 0; i < queueSize; i++){
                TreeNode temp = queue.pop();
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            
            subresult = new LinkedList<Integer>();
            if(flag % 2 == 0){
                for(int i = queue.size() - 1; i >= 0; i--) subresult.add(queue.get(i).val);
            }
            else{
                for(int i = 0; i < queue.size(); i++) subresult.add(queue.get(i).val);
            }
            flag++;
            queueSize = queue.size();
            if(subresult.size() > 0)result.add(subresult);
            
        }
        return result;
    }
}