class FindSubstring{

    public int findSubstringInWraproundString(String p) {
        if(p == null || p.length() == 0) return 0;
        int[][] dp = new int[p.length()][p.length()];
        for(int i = 0; i < dp.length; i++) dp[i][i] = 1;
        for(int i = p.length() - 2; i >= 0; i--){
            for(int j = i + 1; j < p.length(); j++){
                if(p.charAt(i) == p.charAt(j) - 1 || p.charAt(i) == p.charAt(j) - 25) dp[i][j]++;
                else dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
            }
        }
        
        return dp[0][p.length() - 1];
    }
}