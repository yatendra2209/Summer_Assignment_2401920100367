class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int min=Integer.MAX_VALUE;
        for (int price:prices){
            if (price<min){
                min=price;
            }
            else {
                int profit=price-min;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }
} 
