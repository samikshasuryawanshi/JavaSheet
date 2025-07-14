class diagonalSum{
    public static int diagonalSum(int matrix[][]){
        //less optimized way with o(n^2)
        int sum=0;
        // for(int i =0;i<matrix.length;i++){
        //     for(int j =0;j<matrix[0].length;j++){
        //         //for primary diagonal
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         //for secondary diagonal
        //         else if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }



        //more optimized way with o(n)

        for(int i =0;i<matrix.length;i++){
            //for pd
            sum += matrix[i][i];

            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }

        }
        return sum;
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
}
