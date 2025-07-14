public class firstOccurence{
    public static int fOcc(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return fOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
       int arr[] = {4,6,9,2,10,67,23,54,11,24};
       System.out.println(fOcc(arr,99,0)); 
    }
}