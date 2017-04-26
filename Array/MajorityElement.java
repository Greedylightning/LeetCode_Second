import java.util.Iterator;
import java.util.Map;

class MajorityElement{

    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement(int[] nums){

       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
        }

        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()){
            int key = iter.next();
            int count = map.get(key);
            if(count > nums.length / 2) return key;
        }

        return -1;
    }
}