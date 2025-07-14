class power{
    public static int powerX(int x,int n){
        if( n == 0){
            return 1;
        }
        int xnm1 = powerX(x,n-1);
        int xn = x * xnm1;
        return xn;

        // return x * powerX(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(powerX(2, 0));
    }
}