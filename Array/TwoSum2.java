import java.util.Map;

class TwoSum2{

    public int[] twoSum(int[] numbers, int target) {
       int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++){
            int low = i;
            int high = numbers.length - 1;
            while(low <= high){
                int mid = (low + high) >> 1;
                if(numbers[i] + numbers[mid] == target){
                    result[0] = i;
                    result[1] = mid;
                    return result;
                }
                else if(numbers[i] + numbers[mid] > target) high = mid - 1;
                else low = mid + 1;
            }
        }
        return result;
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int low = 0;
        int high = numbers.length - 1;

        while(low < high){
            if(numbers[low] + numbers[high] == target){
                result[0] = low + 1;
                result[1] = high + 1;
                return result;
            }
            else if(numbers[low] + numbers[high] > target){
                high--;
            }
            else low++;
        }
        return result;
    }
}