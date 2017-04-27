class FindMinimumSortedArray{
    public int findMin(int[] nums) {
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                index = i;
                break;
            } 
        }
        return nums[0] > nums[index] ? nums[index] : nums[0];
    }
}