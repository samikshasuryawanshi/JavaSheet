import java.util.*;
class SolidRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for outer loop : ");
        int n = sc.nextInt();
        System.out.print("Enter value for inner loop : ");
        int m = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            //outer loop
            for(int j = 1; j<=m ; j++){
                //inner loop
                System.out.print("*");
            }
            // to print the pattern in next line
            System.out.println("");
        }

    }
}