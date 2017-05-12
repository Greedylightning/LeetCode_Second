class DecodeString{

    public String decodeString(String s) {
        Stack<String> stack = new Stack<String>();
        
        for(int j = 0; j < s.length(); j++){
            String num = "";
            while(Character.isDigit(s.charAt(j))){
                num = num + s.substring(j, j+1);
                j++;
            }
            if(!num.equals(""))stack.push(num);
            if(s.charAt(j) == ']'){
                String top = stack.pop();
                String subString = "";
                while(!top.equals("[")){
                    subString = top + subString;
                    top = stack.pop();
                }
                int times = Integer.parseInt(stack.pop());
                StringBuffer temp = new StringBuffer();
                for(int i = 0; i < times; i++) temp.append(subString);
                stack.push(temp.toString());
            }
            else stack.push(Character.toString(s.charAt(j)));
        }
        
        String result = "";
        while(stack.size() > 0) result = stack.pop() + result;
        return result;
    }
}