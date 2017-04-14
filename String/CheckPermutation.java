public class CheckPermutation{

    int[] table = new int[26];

    public boolean checkPermutation(String s1, String s2){

        if(s1 == null && s2 == null) return true;
        if(s1 == null || s2 == null || s1.length() != s2.length()) return false;

        for(int i = 0; i < s1.length(); i++){
            table[s1.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < s2.length(); i++){
            table[s2.charAt(i) - 'a'] -= 1;
        }

        for(int i = 0; i < table.length; i++){
            if(table[i] != 0) return false;
        }
        return true;
    }

    public boolean checkPermutation(String s1, String s2){

        char[] s11 = Array.sort(s1.toCharArray());
        char[] s22 = Array.sort(s2.toCharArray());
        if(s11.length != s22.length) return false;

        return s11.toString().equals(s22.toString());
    }
}