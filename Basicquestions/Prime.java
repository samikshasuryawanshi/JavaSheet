class Prime{
//Approach first ----------------------------------------------------------------
//     public static boolean isPrime(int n) {
//         boolean isPrime = true;
//       for(int i = 2;i<=n-1;i++){
//          if(n%i == 0){
//             isPrime = false;
//             break;
//         }
//     }
//     return  isPrime;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(10));
//     }

//APPROACH NEW--------------------------------
//for corner cases 1 is not prime so we are startung with two so the corner is 2

    // public static boolean isPrime(int n) {
    //     if(n==2){
    //         return true;
    //     }

    //     for (int i = 2; i <=n ; i++) {
    //         if(n%i==0){
    //             return  false;
    //         }
    //     }
    //     return true;
    // }


    //OPTIMIZED WAY TO SOLVE THIS QUESTION

    public static boolean isPrime(int n) {
        if(n == 1) return true;

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
        }


    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}