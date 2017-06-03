class Intersection2{

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i : nums1){
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        
        for(int i : nums2){
            if(map.containsKey(i) && map.get(i) > 0){
                set.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        
        int[] result = new int[set.size()];
        Iterator iter = set.iterator();
        int i = 0;
        while(iter.hasNext()){
            result[i++] = (Integer)iter.next();
        }
        return result;
    }
}