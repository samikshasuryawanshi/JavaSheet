import java.util.*;
class InvertedHalfPyramid180{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr value of n : ");
        int n = sc.nextInt();

        for(int i = 1 ;i<= n ;i++){
            //inner loop for space 
            for(int j = 1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            //innner loop for stars
            for(int j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}