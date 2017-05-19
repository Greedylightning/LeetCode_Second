class Subset{

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtrack(result, new ArrayList(), nums, 0);
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> subresult, int[] nums, int start){
        result.add(new ArrayList(subresult));
        for(int i = 0; i < nums.length; i++){
            subresult.add(nums[i]);
            backtrack(result, subresult, nums, i + 1);
            subresult.remove(subresult.size() - 1);
        }
    }
}