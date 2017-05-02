class Subset1{

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> subresult, int[] nums, int start){
        result.add(new ArrayList(subresult));
        for(int i = start; i < nums.length; i++){
            subresult.add(nums[i]);
            helper(result, subresult, nums, i + 1);
            subresult.remove(subresult.size() - 1);
        }
    }
}