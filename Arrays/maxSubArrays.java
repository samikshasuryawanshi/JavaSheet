class maxSubArrays{
    public static void MaxSubArrays(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                int currSum = 0;
                for(int k = start ; k<=end; k++){
                    // System.out.print(numbers[k] +" " );
                    //subarrays sum
                    currSum += numbers[k];
                }
                System.out.print(currSum + " ");
                if(maxSum < currSum){
                    maxSum = currSum;
                }else{
                    minSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of contiguous subarray is: " + maxSum);
        System.out.println("Minimum sum of contiguous subarray is: " + minSum);
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8};
        MaxSubArrays(numbers);
    }
}