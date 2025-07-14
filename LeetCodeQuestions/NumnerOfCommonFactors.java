
import java.util.Scanner;

class NumnerOfCommonFactors{


    // public static int findCommonFactors(int a , int b){
    //    int gcd = FindGCD(a, b);
    //    int count =0;
    //    for(int i = 1;i<=gcd;i++){
    //     if(gcd%i == 0){
    //         count++;
    //     }
    //    }
    //    return  count;
    // }

    // public static int FindGCD(int a , int b){
    //     while(b!=0){
    //         int temp = b;
    //         b = a%b;
    //         a = temp;
    //     }
    //     return Math.abs(a);
    // }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of a : ");
    //     int a = sc.nextInt();

    //     System.out.print("Enter value of b : ");
    //     int b = sc.nextInt();


    //     System.out.println(findCommonFactors(a, b));
    // }

    public static int commonFactors(int a, int b) {
        int GCD = findGCD(a,b);
        int count=0;

        for(int i=1;i<=GCD ;i++){
            if(GCD % i == 0){
                count++;
            }
        }
        return count;
    }


    public static int findGCD(int a , int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a :");
        int a = sc.nextInt();

        System.out.println("Enter value of b :");
        int b = sc.nextInt();

        System.out.println(commonFactors(a,b));
    }
}