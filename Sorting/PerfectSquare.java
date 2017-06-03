class PerfectSquare{

    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int low = 1, high = num / 2;
        while(low <= high){
            int mid = (low + high) >>> 1;
            if(mid == 1.0 * num / mid) return true;
            else if(mid < 1.0 * num / mid) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}