class GenerateParentheses{

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        helper(result, "", 0, 0, n);
        return result;
    }
    
    public void helper(List<String> result, String temp, int open, int close, int max){
        if(temp.length() == max * 2){
            result.add(temp);
            return ;
        }
        if(open < max) helper(result, temp + "(", open + 1, close, max);
        if(close < open) helper(result, temp + ")", open, close + 1, max);
    }
}