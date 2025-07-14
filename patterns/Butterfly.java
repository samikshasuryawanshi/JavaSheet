import java.util.*;
class Butterfly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();

        // upper half
        for(int i = 1;i<=n;i++){
            // for 1 part
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }

            //for spaces
            int spaces = 2*(n-i);
            for(int j = 1 ;j<=spaces;j++){
                System.out.print(" ");
            }
            //for second part
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");
        }

        //for bottom half
         for(int i = n;i>=1;i--){
            // for 1 part
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }

            //for spaces
            int spaces = 2*(n-i);
            for(int j = 1 ;j<=spaces;j++){
                System.out.print(" ");
            }

            //for second part
            for(int j = 1 ;j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}