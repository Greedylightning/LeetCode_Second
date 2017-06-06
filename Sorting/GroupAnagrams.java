class GroupAnagrams{

    class AnagramComparator implements Comparator<String>{
        private String sortChars(String s){
            char[] content = s.toCharArray();
            Arrays.sort(content);
            return new String(content);
        }

        public int compare(String s1, String s2){
            return sortChars(s1).compareTo(sortChars(s2));
        }
    }
    public void groupAnagrams(String[] strs){

        Arrays.sort(strs, new AnagramComparator());
    }

    void sort(String[] array){
        HashMapList<String, String> mapList = new HashMapList<String, String>();
        for(String s : array){
            mapList.put(sortChars(s), s);
        }
        int index = 0;
        for(String key : mapList.keySet()){
            for(String s : mapList.get(key)) array[index++] = s;
        }
    }
}