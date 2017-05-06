class RestoreIPAddress{
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        backtrack(result, "", s, 0, 0);
        return result;
    }
    
    public void backtrack(List<String> result, String temp, String ip, int idx, int count){
        if(count > 4) return ;
        if(count == 4 && idx == ip.length()) result.add(temp);
        
        for(int i = 1; i < 4; i++){
            if(idx + i > ip.length()) break;
            String s = ip.substring(idx, idx + i);
            if((s.startsWith("0") && s.length() > 1) || (i == 3 && Integer.parseInt(s) > 255)) continue;
            backtrack(result, temp+s+(count==3? "" : "."), ip, idx + i,count + 1);
        }
    }
}