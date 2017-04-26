import java.util.Map;

class PairArray{
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int head = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(k == Math.abs(head - nums[j])){
                    int tail = nums[j];
                    int first = head > tail ? head : tail;
                    int second = head > tail ? tail : head;
                    if(map.containsKey(first)){
                        if(map.get(first) != second) count++;
                    }
                    else{
                        map.put(first,second);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}