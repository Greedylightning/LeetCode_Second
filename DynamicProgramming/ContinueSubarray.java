class continuesubarray{

    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return false;
        
        int[] temp = new int[nums.length + 1];
        for(int i = 1; i <= nums.length; i++) temp[i] = temp[i - 1] + nums[i - 1];
        
        for(int i = 0; i < temp.length; i++){
            for(int j = i + 2; j < temp.length; j++){
                if(k == 0){
                    if(temp[j] - temp[i] == 0) return true;
                }
                else{
                    if((temp[j] - temp[i]) % k == 0) return true;
                }
            }
        }
        return false;
    }
}