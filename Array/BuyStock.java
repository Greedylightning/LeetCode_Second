class BuyStock{

    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i = 0; i < prices.length; i++){
            int begin = prices[i];
            int end = 0;
            for(int j = i + 1; j < prices.length; j++){
                if(prices[j] > begin){
                    end = Math.max(end, prices[j]);
                }
            }
            result = Math.max(result, end - begin);
        }
        return result;
    }
}