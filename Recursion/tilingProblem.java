class tilingProblem{
    public static int tilingProb(int n){
        //Base case
        if(n == 0 || n == 1){
            return  1;
        }
        //Kaam
        //vertically
        int fnm1 = tilingProb(n-1);
        //horizontally
        int fnm2 = tilingProb(n-2);
        //sum of both
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProb(4));
    }
}