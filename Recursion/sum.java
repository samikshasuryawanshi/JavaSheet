public class sum{
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int Sum_Minus_one = sum(n-1);
        int Sum = n + Sum_Minus_one;
        return  Sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers: " + sum(n));
    }
}