class MergeSort{
    public static void mergeSort(int arr[],int si ,int ei){
        if(si >= ei) return;
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }
   public static void merge(int arr[],int si,int mid,int ei){
    int temp[] = new int[ei-si+1];
    int i = si; //iterator for left part
    int j = mid+1; //iterator for right part
    int k = 0; //iterator for temp variable
    while(i<=mid && j<=ei){
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
        }
        else{
            temp[k] = arr[j];
            j++;
        }
        k++;
    }
    //for leftout left part elements
    while(i <= mid){
        temp[k++] = arr[i++];
    }
    //for leftout right part elements
    while(j <= ei){
        temp[k++] = arr[j++];
    }
    //copying temp array to original array
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i] = temp[k];
    }
   }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={3,6,8,1,2,3,10};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}