class MaxSubArrayKdanes{


    public  static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("max sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}