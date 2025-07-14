public class factorial{
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fNM1 = fact(n-1);
        int fact_n = n * fNM1;
        return fact_n;

    }
    public static void main(String[] args) {
        int n = 4;
       System.out.println(fact(n));
    }
}