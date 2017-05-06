class GroupAnagram{

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        if(strs == null || strs.length == 0) return result;
        
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //Arrays.sort(strs);
        
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String ss = String.valueOf(temp);
            if(!map.containsKey(ss)) map.put(ss, new ArrayList<String>());
            map.get(ss).add(s);
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}