class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int minprice = prices[0];
        int maxprofit=0;
        for(i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
                minprice=prices[i];
            if(prices[i]-minprice > maxprofit)
                maxprofit=prices[i]-minprice;
        }
        return maxprofit;
    }
}
