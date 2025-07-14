class BubbleSort{


    public static void  BubbleSortOrder(int order[]){
        int n = order.length;
        for(int turn = 0; turn < n-1; turn++){
            for(int j =0; j < n-1-turn; j++){
                if(order[j] > order[j+1]){
                    //swapping
                    int temp = order[j];
                    order[j] = order[j+1];
                    order[j+1] = temp;
                }
            }
        }
    }

    public static  void printArr(int order[]){
        for(int i=0; i<order.length; i++){
            System.out.print(order[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int order[] ={5,76,89,25,90,12,32};
        BubbleSortOrder(order);
        printArr(order);
    }
}