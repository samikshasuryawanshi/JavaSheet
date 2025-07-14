import java.util.*;

class BitOperations{

    //get ith bit
    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    //set ith bit
    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    //clear ith bit
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    //update ith bit
    public static int UpdateIthBit(int n, int i,int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return  n | bitMask;
    }


    //clear i bit

    public static int clearIBit(int n ,int i){
        int bitMask = (~0) << i;
        return  n & bitMask;
    }

    //clear range
    public static int clearRange(int n, int i, int j){
        int a =((~0) << (j+1));
        int b = (1<<i) -1;
        int bitMask = a | b;

        return n & bitMask;
    }

    //power of two
    // public static boolean isPowerOfTwo(int n){
    //     return (n & (n-1)) == 0;
    // }

    
    // public static void main(String[] args) {
    //    System.out.println(isPowerOfTwo(7)); 
    // }
    // public static boolean isPowerOfTwo(int n) {
    //   if(n == 0){
    //     return false;
    //   }
    //   return (n & (n-1)) == 0;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //    System.out.println( isPowerOfTwo(n));
    // }


    // public static double  mySqrt(double x) {
    //     return (Math.sqrt(x));
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     double x = sc.nextDouble();
    //     int result = mySqrt(x);
    //     // System.out.println(new Soltuion().mySqrt(x));
    //     sc.close();
    // }
}