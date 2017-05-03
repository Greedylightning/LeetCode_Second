class CountAndSay{
    public String countAndSay(int n) {
        
        String[] temp = new String[n];
        temp[0] = "1";
        for(int i = 1; i < n; i++){
            String x = temp[i - 1];
            StringBuffer y = new StringBuffer();
            int count = 0;
            int index = 0;
            for(int j = 0; j < x.length(); j++){
                if(x.charAt(index) != x.charAt(j)){
                    y.append(count);
                    y.append(x.charAt(index));
                    count = 0;
                    index = j;
                    j--;
                }
                else if(j == x.length() - 1){
                	count++;
                	y.append(count);
                    y.append(x.charAt(index));
                    count = 0;
                    index = j;
                }
                else{
                    count++;
                }
            }
            
            temp[i] = y.toString();
        }
        return temp[n - 1];
    }
}