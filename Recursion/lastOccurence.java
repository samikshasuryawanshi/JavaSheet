class lastOccurence{
    public static int lastOcc(int arr[],int key,int i){
        if( i == arr.length-1){
            return -1;
        }
        int isFound=lastOcc(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,4,9,10};
        System.out.println(lastOcc(arr, 4, 0));
    }
}