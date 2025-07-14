class EvenOrOdd{
    public static void checkEvenOrOdd(int num){
        int bitMask = 1;
        if((num & bitMask) == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
       checkEvenOrOdd(3);
       checkEvenOrOdd(10); 
    }
}