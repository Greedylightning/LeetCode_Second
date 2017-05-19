class EqualArray{

    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int x : nums){
            count += x - nums[0];
        }
        return count;
    }
}