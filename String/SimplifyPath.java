class SimplifyPath{

    public String simplifyPath(String path) {
		char[] valid = path.toCharArray();
		for(int i = 0; i < valid.length; i++){
			if(valid[i] != '/') break;
			else if(i == valid.length - 1) return "/";
		}
		
        String[] temp = path.split("/");
        if(temp.length == 2 && temp[1].equals("..")) return "/";
        String result = "";
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == null || temp[i].length() == 0) continue;
            if(temp[i].equals(".")){
                if(stack.size() > 0) continue;
                else stack.push("/");
            }
            else if(temp[i].equals("..")){
                if(stack.size() > 0 && !stack.peek().equals("/")) stack.pop();
                else if(stack.size() == 0)stack.push("/");
            }
            
            else stack.push(temp[i]);
        }
        
        if(stack.size() == 0) stack.push("/");
        
        while(stack.size() > 0){
        	String z = stack.pop();
        	if(!z.equals("/")) result = "/"+ z + result;
        	else if(result.length() >= 1 && result.charAt(0) != '/')result = z + result;
        	else if(result.length() == 0)result = result + z;
        }
        
        
        return result;
    }
}