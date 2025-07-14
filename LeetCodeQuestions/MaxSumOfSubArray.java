import java.util.*;

class MaxSumOfSubArray{
    public static boolean  MaxSubArrays(int numbers[], int FindValue){
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                int currSum = 0;
                for(int k = start ; k<=end; k++){
                    currSum += numbers[k];
                }
                if(currSum % FindValue == 0){
                    System.out.println(currSum);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array elements separated by space:");
        String input = sc.nextLine(); 

        String[] tokens = input.split(" ");
        int[] arr = new int[tokens.length];
        
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int FindValue =sc.nextInt();
        System.out.println(MaxSubArrays(arr,FindValue));
    }
}