class MaximumProductSubarray{
    public int maxProduct(int[] nums) {

        if(nums == null || nums.length == 0) return 0;
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        int result = nums[0];
        temp1[0] = nums[0];
        temp2[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            temp1[i] = Math.max(Math.max(temp1[i - 1] * nums[i], temp2[i - 1] * nums[i]), nums[i]);
            temp2[i] = Math.min(Math.min(temp1[i - 1] * nums[i], temp2[i - 1] * nums[i]), nums[i]);
            result = Math.max(result, temp1[i]);
        }

        return result;
    }
}