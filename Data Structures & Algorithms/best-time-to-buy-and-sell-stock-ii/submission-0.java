class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int sum=0;
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]<max){
                sum+=max-prices[i];
                max=prices[i];
            }
            else{
                max=Math.max(prices[i],max);
            }
        }
        return sum;
    }
}