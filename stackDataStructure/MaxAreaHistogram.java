
import java.util.Stack;

class MaxAreaHistogram{
    public static int maxArea(int arr[]) {
        int maxArea = 0;
        int nextSmallerR[] = new int[arr.length];
        int nextSmallerL[] = new int[arr.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerR[i] = arr.length;

            }
            else{
                nextSmallerR[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerL[i] = arr.length;

            }
            else{
                nextSmallerL[i] = s.peek();
            }
            s.push(i);
        }
        

        //calculate max area
        for(int i =0;i<arr.length;i++){
            int height = arr[i];
            int width = nextSmallerR[i] - nextSmallerL[i] - 1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println("Maximum area is " + maxArea(arr));
    }
}