class NumberComplement{

    public int findComplement(int num) {
        if(num == 0) return 0;
        StringBuffer result = new StringBuffer();
        while(num != 0){
            if((num & 1) == 1) result.append("0");
            else result.append("1");
            num = num >>> 1;
        }
        int number = 0;
        char[] temp = result.toString().toCharArray();
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == '1') number += Math.pow(2, i);
        }
        return number;
    }
}