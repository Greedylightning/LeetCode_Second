class ConvertNumer{

    public String toHex(int num) {
        String[] temp = new String[]{"a", "b", "c", "d", "e", "f"};
        if(num == 0) return "0";
        StringBuffer result = new StringBuffer();
        while(num != 0){
            int x = (num & 15);
            if(x >= 10) result.append(temp[x - 10]);
            else result.append(x);
            num = (num >>>4);
        }
        return result.reverse().toString();
    }
}