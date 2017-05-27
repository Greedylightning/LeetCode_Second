class RangeSumQuery{

    int sum = 0;
    int[] temp;
    public NumArray(int[] nums) {
        if(nums == null || nums.length == 0) temp = null;
        else{
            temp = new int[nums.length];
            temp[0] = nums[0];
            for(int i = 1; i < nums.length; i++){

                temp[i] += temp[i - 1] + nums[i];
            }
        }
        
    }

    public int sumRange(int i, int j) {
        if(i == 0) return temp[j];
        else return temp[j] - temp[i - 1];
    }
}