class SearchInsertPosition{

    public int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        
        if(nums[low] > target) return 0;
        if(nums[high] < target) return high + 1;
        
        while(high >= low){
            mid = (low + high) >> 1;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}