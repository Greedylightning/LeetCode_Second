class SortCharacter{

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap();
        for(char x : s.toCharArray()){
            if(map.containsKey(x)) map.put(x, map.get(x) + 1);
            else map.put(x, 1);
        }
        
        List<Character>[] bucket = new List[s.length() + 1];
        for(char key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(char c : bucket[i]){
                    for(int j = 0; j < map.get(c); j++) sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}