
import java.util.ArrayList;

class ContainerWithMostWater{

    //Brute force
    // public static int StoreWater(ArrayList<Integer> height){
    //     int maxArea = 0;
    //     for(int i = 0; i < height.size(); i++){
    //         for(int j = i+1; j < height.size(); j++){
    //             int mHeight = Math.min(height.get(i),height.get(j));
    //             int width = j - i;

    //             int area = mHeight * width;
    //             maxArea = Math.max(maxArea, area);

    //         }
    //     }
    //      return maxArea;
    // }



    //TWO POINTER APPROACH
    public static int StoreWater(ArrayList<Integer> height){
        int maxArea = 0;
        int left = 0;
        int right = height.size() - 1;


        while(left < right){
            int ht = Math.min(height.get(left), height.get(right));
            int wd= right-left;

            int area = ht * wd;

            maxArea = Math.max(maxArea, area);

            if(height.get(left) < height.get(right)){
                left++;
            }else{
                right--;
            }

        }
        return  maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


        System.out.println("Maximum water that can be stored is: " + StoreWater(height));

    }
}