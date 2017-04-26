class MaximumSubarray{

    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int plusResult = 0;
            int curResult = Integer.MIN_VALUE;
            for(int j = i; j < nums.length; j++){
                plusResult = plusResult + nums[j];
                curResult = Math.max(plusResult, curResult);
            }
            result = Math.max(result, curResult);
        }
        return result;
    }

    public int maxSubArray(int[] A) {  
    if(A==null || A.length==0)  
        return 0;  
    int global = A[0];  
    int local = A[0];  
    for(int i=1;i<A.length;i++)  
    {  
        local = Math.max(A[i],local+A[i]);  
        global = Math.max(local,global);  
    }  
    return global;  
}  
}