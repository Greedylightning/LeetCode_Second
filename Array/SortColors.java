class SortColors{

    public void sortColors(int[] nums) {
        
        int zero = 0;
        int one = 0;
        int two = 0;
        
        for(int i : nums){
            if(i == 0) zero++;
            else if(i == 1) one ++;
            else two++;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i < zero) nums[i] = 0;
            else if(i >= zero && i < zero + one) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}