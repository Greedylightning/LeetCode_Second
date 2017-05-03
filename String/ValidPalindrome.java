class ValidPalindrome{

    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        StringBuffer temp = new StringBuffer();
        for(char x : s.toCharArray()){
            if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x >= '0' && x <='9')) temp.append(x);
        }
        return temp.toString().toLowerCase().equals(temp.reverse().toString().toLowerCase());
    }
}