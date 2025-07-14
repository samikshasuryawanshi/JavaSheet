
import java.util.*;

//call by value
class Swap{
    // public static void main(String[] args) {
    //     Scanner sc = new  Scanner(System.in);

    //     System.out.print("Enter value of a : ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter value of b : ");
    //     int b = sc.nextInt();

    //     int temp = a; 
    //     a = b;
    //     b = temp;
    //     System.out.println("After Swapping a is : " + a);
    //     System.out.println("After Swapping b is : " + b);
    // }

    //using function>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after Swapping a is : " + a);
        System.out.println("after Swapping b is : " + b);
    }

    public static void main(String[] args) {
         Scanner sc =  new  Scanner(System.in);
         System.out.print("Enter value fo a : ");
         int a = sc.nextInt();
         System.out.print("Enter value fo b : ");
         int b = sc.nextInt();

         swap(a, b);
    }
}


