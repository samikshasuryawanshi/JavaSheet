class SelectionSort{

    public static void selectionSort(int arr[]){
        for(int i =0;i<arr.length;i++){
            int minPosition = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[minPosition]){ //for decreasing order just change the < with >
                    minPosition = j;
                }
            }
            //swap 
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArray(arr);
    }
}