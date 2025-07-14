
import java.util.ArrayList;

class PairSum{


    //Brute force
    public static boolean twoSum(ArrayList<Integer> list,int target){
        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }


    //Otimized
    public static boolean twoSumOptimized(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp= list.size()-1;

        while(lp!=rp){
            int sum = list.get(lp) + list.get(rp);
            if(sum == target){
                return true;
            } else if(sum < target){
                lp++;
            } else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);

       int target = 10;
    System.out.println(twoSumOptimized(list, target)); // Output: true
    }
}