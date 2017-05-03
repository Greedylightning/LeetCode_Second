class ReverseWords{

    public String reverseWords(String s) {
        s = s.trim();
        StringBuffer result = new StringBuffer();
        if(s == null || s.length() == 0) return "";
        String[] temp = s.split("\\s+");
        for(String x : temp){
            result.append(new StringBuffer(x).reverse().toString());
            result.append(" ");
        }
        
        return result.substring(0, result.length() - 1).toString();
    }
}