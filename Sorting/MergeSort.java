class MergeSort{

    public void sortMerge(int[] nums){
        int[] temp = new int[nums.length];
        sortMerge(nums, temp, 0, nums.length - 1);
    }

    public void sortMerge(int[] nums, int[] temp, int begin, int end){
        if(begin < end){
            int mid = (begin + end) >>> 1;
            sortMerge(nums, temp, begin, mid);
            sortMerge(nums, temp, mid + 1, end);
            merge(nums, begin, mid, end, temp);
        }

    }

    public void merge(int[] nums, int begin, int mid, int end, int[] temp){
        int indexl = begin, indexr = mid + 1;
        int key = 0;
        while(indexl <= mid && indexr <= end){
            if(nums[indexl] < nums[indexr]){
                temp[key++] = nums[indexl++];
            }
            else{
                temp[key++] = nums[indexr++];
            }
        }

        while(indexl <= mid) temp[key++] = nums[indexl++];
        while(indexr <= end) temp[key++] = nums[indexr++];

        for(int i = 0; i < key; i++) nums[begin + i] = temp[i];
    }
}