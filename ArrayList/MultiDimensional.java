
import java.util.ArrayList;

class MultiDimensional{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();


        ArrayList<Integer> subList1 = new ArrayList<>();
        // subList1.add(1);
        // subList1.add(2);
        // subList1.add(3);

        ArrayList<Integer> subList2 = new ArrayList<>();
        // subList2.add(2);
        // subList2.add(4);
        // subList2.add(6);


        ArrayList<Integer> subList3 = new ArrayList<>();
        // subList3.add(3);
        // subList3.add(6);
        // subList3.add(9);


        for(int i =1;i<=5;i++){
            subList1.add(i*1);
            subList2.add(i*2);
            subList3.add(i*3);
        }


        


        mainList.add(subList1);
        mainList.add(subList2);
        mainList.add(subList3);

        System.out.println(mainList);

        for(int i =0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j =0;j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println("");
        }
    }
}