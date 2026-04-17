class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int miniprice = Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
             miniprice=Math.min(miniprice,prices[i]);
            for(int j=i+1;j<n;j++){
                int profit=prices[j]-miniprice;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
}
