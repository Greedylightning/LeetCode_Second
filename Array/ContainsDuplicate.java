import java.util.Set;

class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<Integer>();
        for(int e : nums){
            if(temp.contains(e)) return true;
            temp.add(e);
        }
        return false;
    }
}