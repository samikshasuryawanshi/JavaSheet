
import java.util.Arrays;
import java.util.*;


class FractionalKnapsack{
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weights[] ={10,20,30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] =val[i]/ (double)weights[i];
        }


        //ascending order sorting
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int totalValue = 0;

        for(int i =ratio.length-1;i>=0;i--){
            int idx =(int)ratio[i][0];
            if(capacity>=weights[idx]){
                totalValue += val[idx];
                capacity -= weights[idx];
            }else{
                totalValue += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }

        
        System.out.println("Total value of knapsack is : "+totalValue);

    }
}