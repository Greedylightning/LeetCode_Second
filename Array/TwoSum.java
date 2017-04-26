class TwoSum{
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++){
            int first = numbers[i];
            int low = i + 1;
            int high = numbers.length - 1;
            while(low <= high){
                int mid = (low + high) >> 1;
                if(first + numbers[mid] == target){
                    result[0] = i + 1;
                    result[1] = mid + 1;
                    return result;
                }
                else if(first + numbers[mid] >= target) high = mid - 1;
                else low = mid + 1;
            }
        }
        return result;
    }
}