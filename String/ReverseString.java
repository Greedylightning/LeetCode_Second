class ReverseString{

    public String reverseStr(String s, int k) {
        StringBuffer temp = new StringBuffer();
        int begin = 0;
        int end = s.length() - 1;
        while(begin + 2 * k - 1<= end){
            
            temp.append(new StringBuffer(s.substring(begin, begin + k)).reverse().toString());
            temp.append(s.substring(begin + k, begin + 2 * k));
            begin = begin + 2 * k;
        }
        
        if(end - begin < k){
                temp.append(new StringBuffer(s.substring(begin, end + 1)).reverse().toString());
                //return temp.toString();
            }
            if(end - begin < 2 * k && end - begin >= k){
                temp.append(new StringBuffer(s.substring(begin, begin + k)).reverse().toString());
                temp.append(s.substring(begin + k, end + 1));
                //return temp.toString();
            }
        return temp.toString();
    }
}