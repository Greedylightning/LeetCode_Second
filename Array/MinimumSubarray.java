class MinimumSuarray{

    public int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];
                if(sum >= s){
                    result = Math.min(j - i + 1, result);
                    sum = 0;
                    break;
                }
            }
        }
        return result;
    }
}