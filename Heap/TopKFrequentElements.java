class TopKFrequentElement{

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> result = new ArrayList();
        for(int x : nums){
            if(map.containsKey(x)) map.put(x, map.get(x) + 1);
            else map.put(x, 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int x : map.keySet()){
            int freq = map.get(x);
            if(bucket[freq] == null) bucket[freq] = new ArrayList();
            bucket[freq].add(x);
        }
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] == null) continue;
            if(bucket[i] != null){
                k = k - bucket[i].size();

                for(int j = 0; j < bucket[i].size(); j++){
                    result.add(bucket[i].get(j));
                }
                if(k == 0){
                    break;
                }
            }

        }
        return result;
    }
}