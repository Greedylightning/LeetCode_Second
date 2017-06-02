class QuickSort{

    public void sortQuick(int[] nums){
        sortQuick(nums, 0, nums.length - 1);
    }

    public void sortQuick(int[] nums, int begin, int end){
        int key = nums[begin];
        int left = begin;
        int high = end;

        while(left < right){
            while(left < right && nums[right] > key) right--;
            nums[left] = nums[right];
            while(left < right && nums[left] < key) left++;
            nums[right] = nums[left];
        }
        nums[left] = key;
        sortQuick(nums, begin, left - 1);
        sortQuick(nums, left + 1, end);
    }
}