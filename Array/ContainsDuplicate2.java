import java.util.Map;

class ContainsDuplicate2{

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(temp.containsKey(nums[i]) && Math.abs(i - temp.get(nums[i])) <= k) return true;
            temp.put(nums[i], i);
        }
        return false;
    }
}