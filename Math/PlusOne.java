class PlusOne{

    public int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length + 1];
        int carry;
        if(digits[digits.length - 1] + 1 >= 10){
            temp[temp.length - 1] = digits[digits.length - 1] + 1 - 10;
            carry = 1;
        }
        else{
            temp[temp.length - 1] = digits[digits.length - 1] + 1;
            carry = 0;
        }
        for(int i = digits.length - 2; i >= 0; i--){
            if(digits[i] + carry >= 10){
                temp[i + 1] = digits[i] + carry - 10;
                carry = 1;
            }
            else{
                temp[i + 1] = digits[i] + carry;
                carry = 0;
            }
        }
        if(carry == 1){
            temp[0] = 1;
            return temp;
        }
        else{
            int[] result = new int[digits.length];
            for(int i = 0; i < result.length; i++) result[i] = temp[i + 1];
            return result;
        }
        
    }
}