import java.util.*;

class DivideTwoInteger{

    // public static int divide(int dividend, int divisor) {
    //     // Edge case: If divisor is zero, division is undefined
    //     if (divisor == 0) {
    //         throw new ArithmeticException("Division by zero is undefined.");
    //     }

    //     // Edge case: Overflow when dividend is Integer.MIN_VALUE and divisor is -1
    //     if (dividend == Integer.MIN_VALUE && divisor == -1) {
    //         return Integer.MAX_VALUE;
    //     }

    //     // Determine the sign of the result
    //     int negative = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

    //     // Convert both numbers to positive using absolute value
    //     long absDividend = Math.abs((long) dividend);
    //     long absDivisor = Math.abs((long) divisor);

    //     // Initialize result
    //     int result = 0;

    //     // Repeatedly subtract divisor from dividend and count the number of subtractions
    //     while (absDividend >= absDivisor) {
    //         long tempDivisor = absDivisor, multiple = 1;

    //         // Double the divisor and multiple while the doubled divisor is still <= dividend
    //         while (absDividend >= (tempDivisor << 1)) {
    //             tempDivisor <<= 1;
    //             multiple <<= 1;
    //         }

    //         // Subtract the largest possible multiple of divisor
    //         absDividend -= tempDivisor;
    //         result += multiple;
    //     }

    //     // Apply the sign to the result
    //     return negative == -1 ? -result : result;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of dividend : ");
    //     int dividend = sc.nextInt();
    //     System.out.print("Enter value of divisor : ");
    //     int divisor = sc.nextInt();

    //     try {
    //         System.out.println(divide(dividend, divisor));
    //     } catch (ArithmeticException e) {
    //         System.out.println(e.getMessage());
    //     }
    // }



     public static int divide(int dividend, int divisor) {
        if(divisor==0){
            throw new ArithmeticException("undefined");
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        //determine sign
        int negative = (dividend < 0)^(divisor < 0) ? -1:1;
        //convert into +ve
        long absDividend = Math.abs((long)dividend);
        long absDivisor = Math.abs((long)divisor);

        int result = 0;

        while(absDividend >= absDivisor){
            long tempDivisor = absDivisor ;
            long multiple = 1; 

            while(absDivisor >= (tempDivisor << 1)){
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            absDividend -= tempDivisor;
            result += multiple;
        }
        return negative == -1 ? -result : result;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter value of divisor : ");
        int divisor = sc.nextInt();

        try{
            System.out.println(divide(dividend,divisor));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}