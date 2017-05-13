class ListOfDepths{

    //BFS
    public List<List<TreeNode>> createLevelLinkedList(TreeNode root){
        List<List<TreeNode>> lists = new ArrayList<List<TreeNode>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return lists;
        queue.add(root);
        while(!queue.isEmpty()){
            lists.add(queue);
            List<TreeNode> parents = queue;
            queue = new LinkedList<TreeNode>();
            for(TreeNode n : parents){
                if(n.left != null) queue.add(n.left);
                if(n.right != null) queue.add(n.right);
            }
        }
        return lists;
    }

    //DFS
    public List<List<TreeNode>> createLevelLinkedList(TreeNode root){
        List<List<TreeNode>> lists = new ArrayList<List<TreeNode>>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    public void createLevelLinkedList(TreeNode root, List<List<TreeNode>> lists, int level){
        if(root == null) return null;
        List<TreeNode> list = null;
        if(lists.size() == level){
            list = new LinkedList<TreeNode>();
            lists.add(list);
        }
        else list = lists.get(level);
        list.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }
}