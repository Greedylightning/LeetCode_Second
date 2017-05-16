class MostFrequentSubtreeSum{

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        helper(root, map);
        List<Integer> temp = new ArrayList<Integer>();
        Iterator<Integer> iter = map.keySet().iterator();
        int max = 0;
        while(iter.hasNext()){
            max = Math.max(max, map.get(iter.next()));
        }
        Iterator iter1 = map.keySet().iterator();
        while(iter1.hasNext()){
            Integer x = (Integer)iter1.next();
            if(map.get(x) == max) temp.add(x);
        }
        int[] result = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            result[i] = temp.get(i);
        }
        return result;
    }

    public int backtrack(TreeNode root){
        if(root == null) return 0;

        return backtrack(root.left) + backtrack(root.right) + root.val;
    }

    public void helper(TreeNode root, Map<Integer, Integer> map){
        if(root == null) return;
        helper(root.left, map);
        int sum = backtrack(root);
        if (map.containsKey(sum)) map.put(sum, map.get(sum) + 1);
        else map.put(sum, 1);
        helper(root.right, map);
    }
}