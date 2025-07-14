import java.util.*;

class FloydsTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        System.out.print("Enter value for Number : ");
        int Number = sc.nextInt();


        for (int i = 1; i <=n  ; i++) {
            for(int j = 1 ; j <= i ; j++){
                System.out.print(Number + " ");
                Number++;
            }
            System.out.println("");  
        }

    }
}