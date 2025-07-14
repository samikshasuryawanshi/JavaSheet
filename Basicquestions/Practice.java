

class Practice{
    public static boolean pallindrome(int x){
        int y = x;
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev*10 + rem;
            x= x/10;
        }
        return y == rev;
    }
    public static long reverse(long x) {
        long rev = 0;
        int negavtive = x < 0 ? -1 : 1;

        x = Math.abs(x);

        while(x>0){
            long rem = x % 10;

            if (rev > (Long.MAX_VALUE - rem) / 10) {
                System.out.println("Reversed number exceeds 64-bit range!");
                return 0;  // Return 0 if it exceeds the range of 64-bit
            }

            rev = rev*10 + rem;
            x = x/10;
        }
        return rev*negavtive;
    }

    public static double myPow(double x, int n) {
        double power = Math.pow(x, n);
        return  power;
    }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of n : ");
    //     int n = sc.nextInt();
    //     System.out.print("Enter value of x : ");
    //     double x = sc.nextDouble();

    //     System.out.println(myPow(x,n));
    // }

//     public static int Divide(int dividend ,int divisor){
//         int result;

//         //it is used to prevent overflow when dividng in java 
//         //the min_value is -2147483648 and the max_value of integer is 2147483647
//         //if dividend is min va,ue and divisor is -1 then it will give max_value in return
//         //^ bitwise XOR used to return the true if one of them is negative if both are negative it will return false
//         int negative = dividend < 0 ^ divisor < 0? -1 : 1;
//         System.out.println(negative);

//     }
//     public static void  main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of dividend : ");
//         int dividend = sc.nextInt();
//         System.out.print("Enter value of dividend : ");
//         int divisor = sc.nextInt();

//         System.out.println(Divide(dividend, divisor));
//     }

}