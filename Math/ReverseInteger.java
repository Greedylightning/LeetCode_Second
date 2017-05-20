class ReverseInteger{

    public int reverse(int x) {
        if(x == 0) return 0;
        
        else if(x > 0){
            long result = 0;
            while(x != 0){
                result = result * 10 + x % 10;
                x = x / 10;
            }
            if(result > Integer.MAX_VALUE) return 0;
            else return (int)result;
        }
        else{
            long result = 0;
            int temp = Math.abs(x);
            while(temp != 0){
                int tail = temp % 10;
                int xx = (int)result;
                result = result * 10 + tail;
                if(result != xx * 10 + tail) return 0;
                temp = temp / 10;
            }
            if(result * -1 < Integer.MIN_VALUE) return 0;
            else return (int)result * -1;
        }
    }
}