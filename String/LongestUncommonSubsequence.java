class LongestUncommonSusequence{

    public int findLUSlength(String[] strs) {
        int result = -1;
        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < strs.length; j++){
                if(i == j) continue;
                if(checkSubs(strs[i], strs[j])) break;
            }
            if(j == strs.length - 1) ressult = Math.max(result, (int)strs[i].length());
        }
    }

    public boolean checkSubs(String subs, String str){
        int i = 0;
        for(char c : str.toCharArray()){
            if(c == subs[i]) i++;
            if(i == subs.size()) break;
        }

        return i == subs.length();
    }
}