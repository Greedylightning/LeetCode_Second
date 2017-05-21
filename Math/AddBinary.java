class AddBinary{

    public String addBinary(String a, String b) {
        StringBuffer s = new StringBuffer();
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        int indexa = as.length - 1;
        int indexb = bs.length - 1;
        int carry = 0;
        while(indexa >= 0 && indexb >= 0){
            if(Character.getNumericValue(as[indexa]) + Character.getNumericValue(bs[indexb]) + carry >= 2){
                s.append(Character.getNumericValue(as[indexa]) + Character.getNumericValue(bs[indexb]) + carry - 2);
                carry = 1;
            }
            else{
                s.append(Character.getNumericValue(as[indexa]) + Character.getNumericValue(bs[indexb]) + carry);
                carry = 0;
            }
            indexa--;
            indexb--;
        }
        while(indexa >= 0){
            if(Character.getNumericValue(as[indexa]) + carry >= 2){
                s.append(Character.getNumericValue(as[indexa])  + carry - 2);
                carry = 1;
            }
            else{
                s.append(Character.getNumericValue(as[indexa]) + carry);
                carry = 0;
            }
            indexa--;
        }
        
         while(indexb >= 0){
            if(Character.getNumericValue(bs[indexb]) + carry >= 2){
                s.append(Character.getNumericValue(bs[indexb])  + carry - 2);
                carry = 1;
            }
            else{
                s.append(Character.getNumericValue(bs[indexb]) + carry);
                carry = 0;
            }
            indexb--;
        }
        if(carry == 1) s.append(1);
        return s.reverse().toString();
    }
}