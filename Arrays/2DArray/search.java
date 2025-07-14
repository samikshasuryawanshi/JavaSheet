

class search{
    public static boolean  searchOP(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==key){
                // System.out.println("Element found at position ("+i+","+j+")");
                return true;
               }
            }
        }
        // System.out.println("Element not found in the matrix");
        return false;
    }
    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // int n =matrix.length, m= matrix[0].length;


        // //input
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         System.out.print("Enter element at " + i + "," + j + ": ");
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // //output
        // for(int i =0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(matrix[j][i] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        System.out.println(searchOP(matrix,5));
    }

}