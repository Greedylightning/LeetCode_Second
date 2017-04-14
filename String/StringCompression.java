public class StringCompression{

    public compressString(String s){
        StringBuilder result = new StringBuilder();
        int count = 0;
        char temp = s.charAt(0);
        for(char x : s.toCharArray()){
            if(temp != x){
                result.append(temp + count);
                count = 0;
                temp = x;
            }
            count++;
        }
        return result.toString();
    }
}