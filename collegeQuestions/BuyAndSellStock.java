class BuyAndSellStock{
    public static int maxProfit(int prices[]) {
        int maxP = 0;
        int buyP = Integer.MAX_VALUE;

        for(int i =0;i<prices.length;i++){
            if(buyP<prices[i]){
                int Profit = prices[i] - buyP;
                maxP = Math.max(maxP, Profit);
            }else{
                buyP = prices[i];
            }
        }
        return maxP;

    }
    public static void main(String[] args) {
        int prices[] = {-567122, -569138, -568454, 623872,623894};
        System.out.println(maxProfit(prices));
        
    }
}