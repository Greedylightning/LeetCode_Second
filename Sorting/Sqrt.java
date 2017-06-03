class Sqrt{

    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int low = 0, high = x;
        long mid = 0;
        while(low <= high){
            mid = (low + high) >>> 1;
            if(mid * mid <= x && (mid + 1) * (mid + 1) > x) return (int)mid;
            else if(mid * mid < x) low = (int)mid + 1;
            else high = (int)mid - 1;
        }
        return (int)mid;
    }
}