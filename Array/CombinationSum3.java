class CombinationSum3{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
    
    public void helper(List<List<Integer>> list, List<Integer> sublist, int[] candidates, int target, int start){
        if(target == 0) list.add(new ArrayList(sublist));
        for(int i = start; i < candidates.length && target >= candidates[i]; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            sublist.add(candidates[i]);
            helper(list, sublist, candidates, target - candidates[i], i + 1);
            sublist.remove(sublist.size() - 1);
        }
    }
}