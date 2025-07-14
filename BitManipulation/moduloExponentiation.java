class moduloExponentiation{

    public static int moduloexpo(int a,int n , int x){
        int ans=1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans % x;
    }

    public static void main(String[] args) {
        System.out.println(moduloexpo(2,5,13));
    }
}