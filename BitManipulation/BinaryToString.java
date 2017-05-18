class BinaryToString{

    public String binaryTo(double n){
        StringBuffer s = new StringBuffer("0.");
        int digits = 0;
        while(n > 0){
            if(digits > 31) break;
            n = n * 2;
            if(n >= 1){
                s.append("1");
                n = n - 1;
            }
            else s.append("0");
        }
        return s.toString();
    }
}