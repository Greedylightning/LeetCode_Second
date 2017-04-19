class PlusOne{

    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        int carry = 0;
        if(digits[digits.length - 1] + 1 == 10){
            result[result.length - 1] = 0;
            carry = 1;
        }
        else{
            result[result.length - 1] = digits[digits.length - 1] + 1;
            carry = 0;
        }
        for(int i = digits.length - 2; i >= 0; i--){
            if(digits[i] + carry == 10){
                result[i + 1] = 0;
                carry = 1;
            }
            else{
                result[i + 1] = digits[i] + carry;
                carry = 0;
            }
        }
        if(carry == 1) result[0] = 1;
        if(result[0] == 0){
            int[] temp = new int[digits.length];
            for(int i = 1; i < result.length; i++) temp[i - 1] = result[i];
        }
        return result;
    }
}