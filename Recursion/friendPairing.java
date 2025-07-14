class friendPairing{
    public static int frienPair(int n){
        if(n == 1 || n == 2) return n ;
        //single 
        int fnm1 = frienPair(n-1);
        //pair
        int fnm2 = frienPair(n-2);
        int pairWays = (n-1)*fnm2;
        //total ways 
        int tWays = fnm1 + pairWays;
        return tWays;  
        //total ways of pairing friends in a group of n people. 1 person can't pair with anyone else. 2 people can pair with each other. Then for n people, there are (n-1)*fnm2 ways to pair them. Then we add these two values to get the total ways.

        //easy way
        // return frienPair(n-1) + (n-1)*frienPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(frienPair(3));
    }
}