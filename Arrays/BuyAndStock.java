class BuyAndStock{

    public static int BuyAndSellStock(int price[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i =0;i<price.length;i++){
            if(BuyPrice < price[i]){
                int Profit = price[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit,Profit); 
            }else{
                BuyPrice = price[i];  // Update buying price when current price is lower than previous buying price.
            }
        }
        return  MaxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit: " + BuyAndSellStock(price));
    }
}