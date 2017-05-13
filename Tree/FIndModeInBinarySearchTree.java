class FindModeInBinarySearchTree{

    private Map<Integer, Integer> map;
    int max = 0;
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        this.map = new HashMap<Integer, Integer>();
        
        inOrder(root);
        
        List<Integer> queue = new LinkedList<Integer>();
        for(int key : map.keySet()){
            if(max == map.get(key)) queue.add(key);
        }
        
        int[] result = new int[queue.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = queue.get(i);
        }
        
        return result;
    }
    
    public void inOrder(TreeNode root){
        if(root.left != null) inOrder(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        max = Math.max(max, map.get(root.val));
        if(root.right != null) inOrder(root.right);
    }
}