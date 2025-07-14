class NQueens{
    //for all the solutions

    // public static void nQueens(char board[][],int row){
    //     if(row == board.length){
    //         printSolution(board);
    //         count++;
    //         return;
    //     }
    //     for(int j =0;j<board.length;j++){
    //         if(isSafe(board,row,j)){
    //             board[row][j] = 'Q';
    //             nQueens(board, row+1); // fn call
    //             board[row][j] = 'X'; // backtrack by resetting the position to 'X'
    //         }
    //     }
    // }


    //for printing 1 solution only
    public static boolean  nQueens(char board[][],int row){
        if(row == board.length){
            // printSolution(board);
            count++;
            return true;
        }
        for(int j =0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                } // fn call
                board[row][j] = 'X'; // backtrack by resetting the position to 'X'
            }
        }
        return false;  // if no solution found after trying all columns for current row
    }

    public static boolean  isSafe(char board[][],int row ,int col){
        //vertical up
        for(int i =row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i =row-1,j= col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i =row-1,j= col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;  // if safe to place queen at row,col position
    }
    public static void printSolution(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }


    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        //call
        // nQueens(board,0);


       //for only one solution
        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printSolution(board);
        }else{
            System.out.println("Solution is not possible");
        }
        System.out.println("Total number of Ways: " + count);
    }
}