public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int buy = 0;
        int sell = 1;
        int profit = 0;
        while(sell < prices.size()){
            if(prices.get(buy) > prices.get(sell)){
                buy = sell;
                sell++;
            }else{
                profit = Math.max(profit, prices.get(sell) - prices.get(buy));
                sell++;
            }
        }
        return profit;
    }
}