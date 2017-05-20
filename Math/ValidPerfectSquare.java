class ValidPerfectSquare{

    public boolean isPerfectSquare(int num) {
        int low = 1; 
        int high = num;
        while(low <= high){
            long mid = (low + high) >>> 1;
            if(num == mid * mid) return true;
            else if(num < mid * mid) high = (int)mid - 1;
            else low = (int)mid + 1;
        }
        return false;
    }
}