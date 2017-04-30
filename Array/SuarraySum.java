class SubarraySum{

    public int subarraySum(int[] nums, int k) {
        
        int sum = 0, count = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum = nums[i];
            if(sum == k) count++;
            for(int j = i + 1; j < nums.length; j++){
                sum = sum + nums[j];
                if(sum == k) count++;
            }
            sum = 0;
        }
        return count;
    }
}