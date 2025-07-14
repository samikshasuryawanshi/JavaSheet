import java.util.*;
class SolidRhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();

        for(int i = 1;i<=n ;i++){
            //for spaces
            int spaces = n-i;
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            //for Stars
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println("");
        }
        System.err.println("");
    }
}