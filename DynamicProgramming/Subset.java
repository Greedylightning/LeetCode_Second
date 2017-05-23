class Subset{

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, new ArrayList<Integer>(), nums, 0, nums.length - 1);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> subresult, int[] nums, int start, int end){
        result.add(new ArrayList(subresult));
        for(int i = start; i <= end; i++){
            subresult.add(nums[i]);
            helper(result, subresult, nums, i + 1, end);
            subresult.remove(subresult.size() - 1);
        }
    }
}