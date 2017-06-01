class UglyNumber{

    public int nthUglyNumber(int n) {
        List<Integer> list = new ArrayList<>();
        int number = 0;
        while(true){
            number++;
            int temp = number;
            while(temp % 2 == 0) temp /= 2;
            while(temp % 3 == 0) temp /= 3;
            while(temp % 5 == 0) temp /= 5;
            if(temp == 1) n--;
            if(n == 0) return number;
        }
        
    }

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for(int i = 1; i < n; i++){
            int min = Math.min(Math.min(factor2, factor3), factor5);
            dp[i] = min;
            if(min == factor2) factor2 = 2 * dp[++index2];
            if(min == factor3) factor3 = 3 * dp[++index3];
            if(min == factor5) factor5 = 5 * dp[++index5];
        }
        return dp[n - 1];
    }
}