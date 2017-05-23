class MinimumMoves{

    public int minMoves2(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int mid = nums.length / 2;
        for(int i = 0; i < nums.length; i++){
            count += Math.abs(nums[mid] - nums[i]);
        }
        return count;
    }
}