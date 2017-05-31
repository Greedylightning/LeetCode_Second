class IsSubsequence{

    public boolean isSubsequence(String s, String t) {
        if(s == null && t == null) return true;
        if(s == null || s.length() == 0) return true;
        if(t == null || t.length() == 0) return false;
        
        int index = 0;
        for(char c : s.toCharArray()){
            for(int i = index; i < t.length(); i++){
                if(c == t.charAt(i)){
                    index = i + 1;
                    break;
                }
                if(i == t.length() - 1) return false;
            }
            if(c != t.charAt(index - 1)) return false;
        }
        return true;
    }
}