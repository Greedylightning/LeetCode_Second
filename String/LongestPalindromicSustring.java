class LongestPalindromicSubstring{

    private int cur, length;
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        
        for(int i = 0; i < s.length() - 1; i++){
            findP(s, i, i);
            findP(s, i, i + 1);
        }
        return s.substring(cur, cur + length);
    }
    
    public void findP(String s, int j, int k){
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        if(length < k - j - 1){
            cur = j + 1;
            length = k - j - 1;
        }
    }
}