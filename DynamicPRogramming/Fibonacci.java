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
    public static void main(String[] args) {
        int n =6;
        int f[] = new int[n+1]; // Array to store Fibonacci numbers
        System.out.println(fib(n, f)); // Output: 8
    }
}