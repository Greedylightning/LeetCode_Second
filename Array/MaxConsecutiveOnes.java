class MaxConsecutiveOnes{

    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int maxCount = 0;

        for(int e : nums){
            if(e == 1) count++;
            if(e == 0){
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        return maxCount;
    }
}