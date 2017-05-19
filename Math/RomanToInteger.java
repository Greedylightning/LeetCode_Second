class RomanToInteger{

    public int romanToInt(String s) {
        int num = 0;
        for(char x : s.toCharArray()){
            if(x == 'I') num += 1;
            else if(x == 'V') num += 5;
            else if(x == 'X') num += 10;
            else if(x == 'L') num += 50;
            else if(x == 'C') num += 100;
            else if(x == 'D') num += 500;
            else if(x == 'M') num += 1000;
        }
        if(s.indexOf("IV") != -1) num -= 2;
        if(s.indexOf("IX") != -1) num -= 2;
        if(s.indexOf("XL") != -1) num -= 20;
        if(s.indexOf("XC") != -1) num -= 20;
        if(s.indexOf("CD") != -1) num -= 200;
        if(s.indexOf("CM") != -1) num -= 200;
        return num;
    }
}