class CombinationSum{

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
    
    public void helper(List<List<Integer>> result, ArrayList<Integer> subresult, int[] candidates, int target, int start){
        if(target == 0) result.add(new ArrayList(subresult));
        for(int i = start; i < candidates.length && target >= candidates[i]; i++){
            subresult.add(candidates[i]);
            helper(result, subresult, candidates, target - candidates[i], i);
            subresult.remove(subresult.size() - 1);
        }
    }
}