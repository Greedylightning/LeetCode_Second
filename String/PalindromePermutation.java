public class PalindromePermutation{

    int[] table = new int[26];

    public boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') table[s.charAt(i) + 32 - 'a']++;
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') table[s.charAt(i) - 'a']++;
        }
        boolean flag = false;
        for(int i = 0; i < table.length; i++){
            if(table[i] % 2 != 0 && flag) return false;
            if(table[i] % 2 != 0) flag = true;
        }
        return true;
    }
}