public class IsUnique{

    boolean[] table = new boolean[26];
    public boolean isUnique(String str){
        int index = -1;
        for(int i = 0; i < str.length(); i++){
            index = str.charAt(i) - 'a';
            if(table[index]) return false;
            table[index] = true;
        }
        return true;
    }

    boolean[] table2 = new boolean[52];

    public boolean isUnique(String str){
        int index = -1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                index = str.charAt(i) - 'A';
                if(table2[index]) return false;
                table2[index] = true;
            }
            else{
                index = str.charAt(i) - 'a';
                if(table2[26 + index]) return false;
                table2[index] = true;
            }
        }
        return true;
    }

    boolean[] table3 = new boolean[128];

    public boolean isUnique(String str){
        int index = -1;
        for(int i = 0; i < str.length(); i++){
            index = Character.getNumericValue(str.charAt(i));
            if(table3[index]) return false;
            table3[index] = true;
        }
        return true;
    }
}