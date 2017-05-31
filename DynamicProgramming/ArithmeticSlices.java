class ArithmeticSlices{

    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3) return 0;
        boolean[][] dp = new boolean[A.length][A.length];
        for(int i = 1; i < A.length - 1; i++){
            if(A[i] - A[i - 1] == A[i + 1] - A[i]) dp[i - 1][i + 1] = true;
        }
        for(int i = A.length - 3; i >= 0; i--){
            for(int j = i + 2; j < A.length; j++){
                if(dp[i][j - 1] && A[j] - A[j - 1] == A[j - 1] - A[j - 2]) dp[i][j] = true;
            }
        }
        
        int count = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(dp[i][j]) count++;
            }
        }
        return count;
    }

    public int numberOfArithmeticSlices(int[] A) {
    int curr = 0, sum = 0;
    for (int i=2; i<A.length; i++)
        if (A[i]-A[i-1] == A[i-1]-A[i-2]) {
            curr += 1;
            sum += curr;
        } else {
            curr = 0;
        }
    return sum;
}
}