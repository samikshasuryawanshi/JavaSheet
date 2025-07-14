import java.util.*;
class NumberPyramid{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();

        for(int i = 1;i<=n; i++){
            //for spaces
            int spaces = n-i;
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            //for print number same as row no.
            for(int j = 1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}