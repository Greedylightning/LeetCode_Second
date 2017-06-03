class FirstBadVersion{
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        int mid = 0;
        while(low <= high){
            mid = ((low + high) >>> 1);
            if(!isBadVersion(mid) && isBadVersion(mid + 1)) return mid + 1;
            else if(isBadVersion(mid)) high = mid - 1;
            else low = mid + 1;
        }
        return mid;
    }
}