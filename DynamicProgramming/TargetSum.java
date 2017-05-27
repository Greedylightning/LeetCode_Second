class TargetSum{

    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null || nums.length == 0) return 0;
        return helper(nums, 0, S, 0, new HashMap<>());
    }
    
    public int helper(int[] nums, int sum, int target, int begin, Map<String, Integer> map){
        String encodeString = begin + "->" + sum;
        if(map.containsKey(encodeString)) return map.get(encodeString);
        if(begin == nums.length){
            if(sum == target) return 1;
            else return 0;
        }
        int add = helper(nums, sum - nums[begin], target, begin + 1, map);
        int minus = helper(nums, sum + nums[begin], target, begin + 1, map);
        map.put(encodeString, add + minus);
        return add + minus;
    }
}