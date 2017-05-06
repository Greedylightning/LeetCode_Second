class OptimalDivision{

    public String optimalDivision(int[] nums) {
        if(nums.length == 1) return nums[0]+"";
        else if(nums.length == 2) return nums[0]+"" +"/"+ nums[1];
        else{
            String sum = nums[0] + "/";
            String sum2 = nums[1] + ""; 
            for(int i = 2; i < nums.length; i++){
                sum2 += "/";
                sum2 += nums[i] + "";
            }
            sum2 = "(" + sum2 + ")";
            return sum + sum2;
        }
    }
}