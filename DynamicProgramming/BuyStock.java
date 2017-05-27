class BuyStock{

    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null) return 0;
        int low = prices[0];
        int ans = 0;
        for(int i = 1; i < prices.length; i++){
            if(low > prices[i]) low = prices[i];
            else if(prices[i] - low > ans) ans = prices[i] - low;
        }
        return ans;
    }
}