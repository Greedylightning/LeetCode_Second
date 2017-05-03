class RepeatedSubstring{

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        
        for(int i = 1; i <= s.length() / 2; i++){
            if(len % s.substring(0, i).length() == 0){
                String x = helper(s.substring(0,i), len / s.substring(0, i).length());
                if(x.equals(s)) return true;
            }
        }
        return false;
    }
    
    public String helper(String temp, int times){
        StringBuffer x = new StringBuffer();
        for(int i = 0; i < times; i++){
            x.append(temp);
        }
        return x.toString();
    }
}