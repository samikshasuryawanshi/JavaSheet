
import java.util.Scanner;

class CountPrimes{

    // public static boolean isPrime(int n ){
    //     if(n==1 || n == 0){
    //        return  true;
    //     }
    //     for(int i = 2; i<=Math.sqrt(n); i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static int PrimesInRange(int n){ 
    //     int count =0;
    //     //we dont return anyhting we are printing so we will use void here
    //     for(int i=2;i<=n;i++){
    //         if(isPrime(i)){
    //                 count++;
    //             }
    //         }
    //     return count;
    // }
 

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of n :");
    //     int n = sc.nextInt();

    //     System.out.println(PrimesInRange(n));
    // }



    // Method to check if a number is prim

    public static int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;  // Initially assume all numbers are prime
        }

        // Mark non-prime numbers using the Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;  // Mark multiples of i as non-prime
                }
            }
        }

        // Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }


}
