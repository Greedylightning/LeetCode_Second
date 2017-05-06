class ReverseWords{

    public String reverseWords(String s) {
        s = s.trim();
        StringBuffer temp = new StringBuffer();
        String[] words = s.split("\\s+");
        for(int i = words.length - 1; i >=1; i--){
            temp.append(words[i]);
            temp.append(" ");
        }
        temp.append(words[0]);
        
        return temp.toString();
    }
}