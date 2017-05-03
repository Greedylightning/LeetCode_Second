class RomanToInt{

    public int romanToInt(String s) {
        int sum = 0;
        for(char x : s.toCharArray()){
            if(x == 'I') sum += 1;
            else if(x == 'V') sum += 5;
            else if(x == 'X') sum += 10;
            else if(x == 'L') sum += 50;
            else if(x == 'C') sum += 100;
            else if(x == 'D') sum += 500;
            else if(x == 'M') sum += 1000;
            else ;
        }
        
        if(s.indexOf("IV") != -1) sum -= 2;
        if(s.indexOf("IX") != -1) sum -= 2;
        if(s.indexOf("XL") != -1) sum -= 20;
        if(s.indexOf("XC") != -1) sum -= 20;
        if(s.indexOf("CD") != -1) sum -= 200;
        if(s.indexOf("CM") != -1) sum -= 200;
        
        return sum;
    }
}