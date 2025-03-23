class Solution {
    public int buyChoco(int[] prices, int money) {
        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        int n = prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<firstMin){
                secondMin=firstMin;
                firstMin=prices[i];
            }else if(prices[i]<secondMin && firstMin!=secondMin){
                secondMin=prices[i];
            }
        }
        if(money>=firstMin+secondMin){
            return money-(firstMin+secondMin);
        }
        return money;
    }
}