class AddDigits{

    public int addDigits(int num) {

        while(true){
            int sum = 0;
            while(num != 0){
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            if(sum < 10) return sum;
            else num = sum;
        }
    }
}