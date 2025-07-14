

class  LargestNumber{

    public static int LargestNumber(int numbers[]){
        int Largest = Integer.MIN_VALUE; //-infinity
        int Smallest = Integer.MAX_VALUE; // + infinity

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > Largest){
                Largest = numbers[i];

            }
            if(numbers[i] < Smallest){
                Smallest = numbers[i];
            }
        }

        return  Smallest;
    }

    public static void main(String[] args) {
        int Numbers[] ={1,5,38,2,45,9,10};
        int LargestNumber = LargestNumber(Numbers);
        
        
        System.out.println("Largest Number: " + LargestNumber);
        

    }
}