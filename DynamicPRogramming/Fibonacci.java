class Fibonacci{
    public static int fib(int n, int f[]){
        if(n==0 || n==1){
            return n; // Base case: fib(0) = 0, fib(1) = 1
        }

        if(f[n] != 0){
            return f[n]; // Return cached result
        }

       f[n] = fib(n-1, f) + fib(n-2, f); // Store result in cache
        return f[n]; // Return the computed Fibonacci number

    }

    public static int fibTablulation(int n){
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2]; // Fill the table iteratively
        }

        return dp[n]; // Return the nth Fibonacci number
    }
    public static void main(String[] args) {
        int n =6;
        int f[] = new int[n+1]; // Array to store Fibonacci numbers
        // System.out.println(fib(n, f)); // Output: 8
        System.out.println(fibTablulation(n)); // Output: 8
    }
}