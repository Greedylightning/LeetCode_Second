class MajorityElement{

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int x : nums){
            if(map.containsKey(x)) map.put(x, map.get(x) + 1);
            else map.put(x, 1);
        }
        Iterator iter = map.keySet().iterator();
        while(iter.hasNext()){
            int temp = (Integer)iter.next();
            if(map.get(temp) > nums.length / 2) return temp;
        }
        return 0;
    }
}