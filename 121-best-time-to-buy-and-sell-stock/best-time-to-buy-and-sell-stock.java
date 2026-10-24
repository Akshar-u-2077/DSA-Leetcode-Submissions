class Solution {
    public int maxProfit(int[] prices) {
    int max=0;
    int min=prices[0];
    for(int price:prices)
    {
        if(price< min)
        {
            min=price;
        }

        max=Math.max(price-min,max);
    }
    return max;
}
}