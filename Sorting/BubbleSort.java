class BubbleSort{

    public void sortBubble(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = nums.length - 1; j > i; j--){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}