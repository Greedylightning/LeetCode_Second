class SearchRange{
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[]{-1,-1};
        if(nums == null || nums.length == 0) return result;
        int low = 0, high = nums.length - 1;
        while(low < high){
            int mid = (low + high) >>> 1;
            if(nums[mid] < target) low = mid + 1;
            else high = mid;
        }
        if(target != nums[low]) return result;
        result[0] = low;
        
        low = 0;
        high = nums.length - 1;
        while(low < high){
            int mid = ((low + high) >>> 1) + 1;
            if(nums[mid] > target) high = mid - 1;
            else low = mid;
        }
        result[1] = high;
        return result;
    }
}