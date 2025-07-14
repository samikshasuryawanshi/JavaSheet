import java.util.*;
class HalfPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n for outer loop : ");
        int n = sc.nextInt();
        char ch='A';

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println(""); 
        }

        //to print the numbers>>>>>>>>>>>>>>>>>>>>>>>>>
    
        for (int line = 1; line <= n; line++) {
            for(int number = 1; number<= line; number++){
                System.out.print(number);
            }
            System.out.println(""); 
        }

        // to print the characters>>>>>>>>>>>>>>>>>>>

        for (int i = 1; i <= n; i++) {
         for(int j = 1; j<= i; j++){
               System.out.print(ch);
               ch++;
         }
         System.out.println(""); 
        }

    }
}