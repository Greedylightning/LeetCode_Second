class CombinationSum{

    int count = 0;
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        //List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(new ArrayList(), nums, 0, nums.length - 1, target);
        return count;
    }

    public void helper(List<Integer> subresult, int[] nums, int begin, int end, int target){
        if(target == 0){
            count++;
            return ;
        }
        for(int i = 0; i <= end && target - nums[i] >= 0; i++){
            subresult.add(nums[i]);
            helper(subresult, nums, i, end, target - nums[i]);
            subresult.remove(subresult.size() - 1);
        }
    }

    public int combinationSum4(int[] nums, int target) {
        if(target == 0) return 1;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(target >= nums[i]) result += combinationSum4(nums, target - nums[i]);
        }
        return result;
    }

    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target);
    }
    
    public int helper(int[] nums, int target){
        if(dp[target] != -1) return dp[target];
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(target >= nums[i]) result += helper(nums, target - nums[i]);
        }
        dp[target] = result;
        return result;
    }
}