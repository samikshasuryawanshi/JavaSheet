import  java.util.*;
class pallindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //for spaces
            int spaces = n-i;
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            //for first half
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }

            //for second half
            for(int j=2;j<=i;j++){ //for double 1 line start with 1 
                System.out.print(j);
            }

            System.out.println("");
        }
    }
}