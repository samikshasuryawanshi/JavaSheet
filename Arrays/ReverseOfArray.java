class ReverseOfArray{
    public static void Reverse(int numbers[]){
        int start = 0;
        int end = numbers.length-1;

        while(start<end){
            //using swap method to reverse the array
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Reverse(numbers);
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }
}