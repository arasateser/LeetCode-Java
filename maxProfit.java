class Solution {
    public int maxProfit(int[] prices) {
        {
            int leastPrice = Integer.MAX_VALUE; // least so far
            int biggestProfit = 0; // overall profit
            int today = 0; // profit if sold today

            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < leastPrice) { // if we found new buy value which is more smaller then previous one
                    leastPrice = prices[i];
                }
                today = prices[i] - leastPrice; // calculating profit if sold today
                
                if (biggestProfit < today) { // if today makes more profit then the previous profit
                    biggestProfit = today;
                }
            }
            return biggestProfit; //return the biggest profit
        }
    }
}
