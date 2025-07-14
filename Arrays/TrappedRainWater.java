import java.util.*;

class TrappedRainWater{
    // Method to calculate trapped rainwater
    public static int TRW(int height[]){
        //calculate leftMax boundary 
        int leftMax[] = new int [height.length];
        leftMax[0] = height[0];
        for(int i =1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate rightMax boundary
        int rightMax[] = new int [height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i =height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //calcuate trappedWater
        int trappedWater = 0;
        for(int i = 1;i<height.length;i++){
            //calcute water level
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            trappedWater += waterLevel - height[i];

        }
        return  trappedWater;
    }
    
    public static void main(String[] args) {
        int height[]= {1,8,6,2,5,4,8,3,7};
        System.out.println("Trapped water : " + TRW(height));
    }

    //  public static int maxArea(int height[]) {
    //     //left Max
    //     int leftMax[] = new int [height.length];
    //     leftMax[0] = height[0];
    //     for(int i = 1;i<height.length;i++){
    //         leftMax[i] = Math.max(height[i],leftMax[i-1]);
    //     }

    //     //right Max
    //     int rightMax[] = new int height.length);
    //     rightMax[height.length-1] = height[height.length-1];
    //     for(int i = height.length-2;i>=0;i--){
    //         rightMax[i] = Math.max(height[i],rightMax[i+1]);
    //     }
    //     //water level
    //     int trappedWater = 0;
    //     for(int i=0;i<height.length;i++){
    //         int waterLevel = Math.min(leftMax[i],rightMax[i]);
    //         trappedWater += waterLevel - height[i];
    //     }
    //     return trappedWater;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int height[] = new int[n];
    //     System.out.println("Enter the elements of the height: "); 
    //     for(int i =0;i<n;i++){
    //         height[i]=sc.nextInt();
    //     }

    //     System.out.println(maxArea(height));

    // }
}