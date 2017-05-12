class EvaluateReversePolishNotation{

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String x : tokens){
            if(x.equals("+")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first + second);
            }
            else if(x.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            }
            else if(x.equals("*")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first * second);
            }
            else if(x.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            }
            else stack.push(Integer.parseInt(x));
        }
        return stack.pop();
    }
}