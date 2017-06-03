class TwoSum{

    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        int[] result = new int[2];
        Arrays.fill(result, -1);
        while(low < high){
            if(numbers[low] + numbers[high] == target){
                result[0] = low + 1;
                result[1] = high + 1;
                break;
            }
            else if(numbers[low] + numbers[high] > target) high--;
            else low++;
        }
        return result;
    }
}