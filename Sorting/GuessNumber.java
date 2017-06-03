class GuessNumber{

    public int guessNumber(int n) {
        int low = 1, high = n;
        int mid = 0;
        while(low <= high){
            mid = (low + high) >>> 1;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == 1) low = mid + 1;
            else if(guess(mid) == -1) high = mid - 1;
        }
        return mid;
    }
}