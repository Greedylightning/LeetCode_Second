public class URLify{

    public String urlify(String s, int length){
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < length; i++){
            if(s.charAt(i) == " ") b.append("%20");
            else b.append(s.charAt(i));
        }
        return b.toString();
    }
}