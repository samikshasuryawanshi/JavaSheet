class DecimalToBinary{

    public static void DecToBin(int DecNum){
        int DecimalNum = DecNum;
        int binNum = 0;
        int pow = 0;

        while(DecNum>0){
            // divde the decimal by two to get the remainder
            int rem = DecNum % 2;

            // calculating the binary number
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            // move to the next digit
            DecNum = DecNum / 2;
            pow++;
        }

        System.out.println("Binary Number of " + DecimalNum + " is " + binNum);
    }


    public static void main(String[] args) {
        DecToBin(5);
    }
}