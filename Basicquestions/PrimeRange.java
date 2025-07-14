
import java.util.Scanner;

class PrimeRange{
    
    public static boolean isPrime(int n ){
        if(n==1 || n == 0){
           return  true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimesInRange(int n){ 
        //we dont return anyhting we are printing so we will use void here
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        System.out.println("");
    }
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrimesInRange(n);
    }
}