
import java.util.Stack;

class StockSpan{
    public static void stockspan(int stocks[],int span[]){
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for(int i = 1; i<stocks.length; i++){
           int currprice = stocks[i];
           while(!stack.isEmpty() && currprice > stocks[stack.peek()]){
             stack.pop();
            } 

            if(stack.isEmpty()){
                span[i] = i + 1;
            }
            else{
                int prevhigh = stack.peek();
                span[i] = i - prevhigh;
            }
            stack.push(i);
        }
}
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int spans[] = new int[stocks.length];

        stockspan(stocks, spans);

        for(int i = 0;i<spans.length;i++){
            System.out.print(spans[i] + " ");
        }
    }
}