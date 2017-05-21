class MySqrt{

    public int mySqrt(int x) {
        if(x < 2) return x;
        int low = 0;
        int high = x;
        while(high >= low){
            long mid = (low + high) >>> 1;
            if(mid * mid <= x && (mid + 1) * (mid + 1) > x) return (int)mid;
            else if(mid * mid > x) high = (int)mid - 1;
            else low = (int)mid + 1;
        }
        return 0;
    }
}