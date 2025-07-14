
import java.util.Scanner;

class PerfectNumbers{
    // public static boolean Perfect(int num){
    //     int sum = 0;
    //     for(int i = 1;i<num;i++){
    //         if(num%i==0){
    //             sum += i;
    //         }
    //     }
    //     if(num == sum){
    //        return true;
    //     } 
    //     return false;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();

    //    System.out.println(Perfect(num));
    // }

     public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i =1;i<num ;i++){
            if(num%i == 0){
                sum += i;
            }
        }

        if(sum == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(checkPerfectNumber(num));
    }
}