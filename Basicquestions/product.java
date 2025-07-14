
import java.util.Scanner;

class product{

    public static void product(int a , int b){
        int product = a*b;
        System.out.println("Product of a and b is : " + product);
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of a : ");
        int b = sc.nextInt();

        product(a,b);

    }
}