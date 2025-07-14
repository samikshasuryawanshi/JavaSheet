public class fibonacci{
    public static  int fib(int n){
        if(n == 0 || n ==1){
            return n;
        }
        int f_n_minus_one = fib(n-1);
        int f_n_minus_two = fib(n-2);
        int f_n = f_n_minus_one + f_n_minus_two;
        return f_n;  // return nth fibonacci number
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n)); // print 55
    }
}