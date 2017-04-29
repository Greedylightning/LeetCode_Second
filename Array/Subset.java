class Subset{

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        helper(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> subresult, int[] nums, int start){
        result.add(new ArrayList(subresult));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]) continue;
            subresult.add(nums[i]);
            helper(result, subresult, nums, i + 1);
            subresult.remove(subresult.size() - 1);
        }
    }
}