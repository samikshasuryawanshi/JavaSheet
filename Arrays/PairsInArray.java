class PairsInArray{
    public static void PrintPairs(int numbers[]){
        int totalPair = 0;
        for(int i = 0;i<numbers.length;i++){
            int current = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("(" + current + "," + numbers[j] + ") ");
                totalPair++;
            }
              System.out.println("");
        }
        System.out.println("Total pairs: " + totalPair);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        PrintPairs(numbers);
    }
}