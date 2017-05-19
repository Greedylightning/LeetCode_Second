class PalindromeNumber{

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        StringBuffer s = new StringBuffer();
        long temp = Math.abs(x);
        while(temp != 0){
            s.append(temp % 10);
            temp /= 10;
        }
        return s.toString().equals(s.reverse().toString());
    }
}