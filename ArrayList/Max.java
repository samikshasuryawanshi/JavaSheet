
import java.util.ArrayList;


class Max{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int index = 0;
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(6);



        for(int i=0; i<list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            //     index = i;
            // }
            

            max = Math.max(max, list.get(i));
            
        }

        System.out.println("Maximum number is: " + max +", at index : "+ index);

    }
}