class ClimbingStairs{

    public int climbStairs(int n) {
        return climbStairs(n, new int[n + 1]);
    }
    
    public int climbStairs(int n, int[] memo) {
        if(n <= 0) return 0;
        if(n == 1 || n == 2) return n;
        else if(memo[n] == 0) memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        return memo[n];
    }

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        if(n >= 2) memo[2] = 2;
        for(int i = 3; i < memo.length; i++) memo[i] = memo[i - 1] + memo[i - 2];
        return memo[n];
    }
}