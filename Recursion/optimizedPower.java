class optimizedPower{
    public static int optPower(int a, int n){
        if(n == 0){
            return  1;
        }
        int halfPower =  optPower(a, n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2 != 0){
            return a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optPower(2, 10));
    }
}