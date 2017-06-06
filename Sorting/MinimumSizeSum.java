class MinimumSizeSum{
    public int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            if(sum >= s){
                result = 1;
                break;
            }
            for(int j = i + 1; j < nums.length; j++){
                sum += nums[j];
                if(sum >= s){
                    result = Math.min(result, j - i + 1);
                    break;
                }
            }
        }
        if(result == Integer.MAX_VALUE) return 0;
        else return result;
    }
}