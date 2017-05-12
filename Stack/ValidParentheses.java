class ValidParebtheses{

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char x : s.toCharArray()){
            if(x == ')' && !stack.empty()){
                char temp = stack.pop();
                if(temp != '(') return false;
            }
            else if(x == ']'&& !stack.empty()){
                char temp = stack.pop();
                if(temp != '[') return false;
            }
            else if(x == '}'&& !stack.empty()){
                char temp = stack.pop();
                if(temp != '{') return false;
            }
            
            else stack.push(x);
        }
        if(stack.size() != 0) return false;
        else return true;
    }
}