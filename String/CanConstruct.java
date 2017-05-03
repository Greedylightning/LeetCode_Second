class CanConstruct{

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table = new int[26];
        for(char x : magazine.toCharArray()){
            table[x - 'a']++;
        }
        
        for(char x : ransomNote.toCharArray()){
            table[x - 'a']--;
        }
        
        for(int i : table){
            if(i < 0) return false;
        }
        return true;
    }
}