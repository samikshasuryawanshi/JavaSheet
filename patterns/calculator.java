import  java.util.*;

class calculator{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of a :");
    int a = sc.nextInt();
    System.out.print("Enter value of b :");
    int b = sc.nextInt();
    System.out.print("Enter operator :");
    String operator = sc.next();

    switch (operator) {
        case "+" : System.out.println(a+b);
        break;
        case "-" : System.out.println(a-b);
        break;
        case "*" : System.out.println(a*b);
        break;
        case "/" : System.out.println(a/b);
        break;
        default : System.out.println(a % b);
    }
    }
}