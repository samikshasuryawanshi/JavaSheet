
class HollowRectangle{
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enetr value for outer loop : ");
    //     int n = sc.nextInt();
    //     System.out.print("Enetr value for inner loop : ");
    //     int m = sc.nextInt();


    //     //outer loop     
    //     for (int i = 1; i <= n; i++) {
    //         //inner loop
    //         for(int j = 1; j <= m; j++){
    //             //(i,j)
    //             if(i == 1 || j == 1 || i == n || j == m){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println("");
    //     }
        
    // }


    public static void Hollow_Rectangle(int rows ,int cols){
        //outer loop
        for(int i =1;i<=rows;i++){
            //inner loop for cols
            for(int j =1;j<=cols;j++){
                //(i,j)
                if( i ==1 || j==1 || i==rows || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(4, 5);
    }
}