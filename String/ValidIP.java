class ValidIP{

    public String validIPAddress(String IP) {
        
        String[] temp = new String[]{};
        boolean v4 = false;
        boolean v6 = false;
        boolean validv4 = true;
        boolean validv6 = true;
        for(char x : IP.toCharArray()){
            if(x == '.'){
                temp = IP.split("\\.",4);
                v4 = true;
                break;
            }
            else if(x == ':'){
                temp = IP.split(":", 8);
                v6 = true;
                break;
            }
            
        }
        
        if(v4){
            for(int i = 0; i < temp.length; i++){
            	if(temp[i] == null || temp[i].length() == 0){
            		validv4 = false;
                    break;
            	}
                if((temp[i].charAt(0) == '0' && temp[i].length() !=1) || temp.length != 4){
                    validv4 = false;
                    break;
                }
                for(int j = 0; j < temp[i].length(); j++){
                    //if(temp[i].charAt(j) >= '0' && temp[i].charAt(j) <= '9') continue;
                    if(temp[i].charAt(j) < '0' || temp[i].charAt(j) > '9'){
                        validv4 = false;
                        break;
                    }
                    else if(j == temp[i].length() - 1){
                    	if(temp[i].length() > 3){
                    		validv4 = false;
                            break;
                    	}
                        if(Integer.parseInt(temp[i]) > 255 || Integer.parseInt(temp[i]) < 0){
                            validv4 = false;
                            break;
                        }
                    }
                    
                }
                if(!validv4) break;
                if(i == temp.length - 1) validv4 = true;
            }
            
        }
        
        else{
            for(int i = 0; i < temp.length; i++){
            	if(temp[i] == null || temp[i].length() == 0){
            		validv6 = false;
                    break;
            	}
                if(temp.length != 8 || temp[i].length() > 4){
                    validv6 = false;
                    break;
                }
                for(char z : temp[i].toCharArray()){
                    if((z >= '0' && z <= '9') || (z >= 'a' && z <= 'f') || (z >= 'A' && z <= 'F')) continue;
                    else{
                        validv6 = false;
                        break;
                    }
                }
                if(!validv6) break;
                if(i == temp.length - 1) validv6 = true;
            }
            
        }
        
        if(v4 && validv4) return "IPv4";
        else if(v6 && validv6) return "IPv6";
        else return "Neither";
	        
	        
        
    }
}