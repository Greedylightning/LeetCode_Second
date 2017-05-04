class LongestSubstring{

     public int lengthOfLongestSubstring(String s) {
        int result = 0;
        if(s.length() == 1) return 1;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.substring(i,j).indexOf(s.substring(j, j + 1)) != -1){
                    result = Math.max(result, j - i);
                    break;
                }
                else if(j == s.length() - 1){
                	result = Math.max(result, j - i + 1);
                	break;
                }
                if(j == s.length() - 1 && result == 0){
                    result = s.length();
                }
            }
        }
        
        return result;
    }
}