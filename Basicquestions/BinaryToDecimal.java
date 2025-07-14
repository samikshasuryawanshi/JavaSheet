class BinaryToDecimal{

    public static void BinToDec(int BiNumber){
        //store the number in the myNum so we can use it later
        int myNum = BiNumber;
        int decNum = 0;
        int pow = 0;

        while(BiNumber > 0){
            //Extracting the last digit of binary number and converting it to decimal number
            int rem = BiNumber % 10;

            //Calculating the decimal number by adding the last digit to the decimal 
            //number multiplied by 2 raised to the power of the current position in binary number

            //Math.pow gives the boolean value so we need to convert it into int for further calculations
            //If the last digit is 1, then rem*(int)Math.pow(2,pow) will be non-zero
            //If the last digit is 0, then rem*(int)Math.pow(2,pow) will be zero
            //This is how we add the last digit to the decimal number in binary number

            //Adding the last digit to the decimal number
            //We are using Math.pow to calculate 2 raised to the power of pow (which is the current position in binary number)
            //We are using the rem as the last digit in binary number and multiplying it with 2 raised to the power of pow to get the decimal equivalent of the last digit
            decNum = decNum + (rem*(int)Math.pow(2,pow));

            pow++;

            //Removing the last digit from binary number
            BiNumber = BiNumber / 10;
        }
        System.out.println("Decimal value of " + myNum +" is : " + decNum);
    }

    public static void main(String[] args) {
        BinToDec(101);
    }
}