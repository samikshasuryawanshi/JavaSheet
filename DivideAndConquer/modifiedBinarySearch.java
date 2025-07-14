class modifiedBinarySearch{
    public static int binarySearch(int arr[], int si,int ei,int target){
        if(si > ei){
            return -1; //element not found in array arr[si..ei]  or arr[si..ei] is not sorted.
        }

        int mid = si+(ei-si)/2;
        if(arr[mid] == target){
            return mid;
        }

        //mid on liene L1
        if(arr[si] <= arr[mid]){
            //case a :left
            if(arr[si] <= target && target<=arr[mid]){
              return binarySearch(arr, si, mid-1, target);
            }else{
                //case b :right
                return binarySearch(arr, mid+1, ei, target);
            }
        }

        //mid on L2
        else{
            //case c :right
            if(arr[mid] <= target && arr[mid] >= arr[ei]){
                return binarySearch(arr, mid+1, ei, target);
            }
            // case d :left
            else{
                return binarySearch(arr, si, mid-1, target);
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 9;
        int targetIndex = binarySearch(arr, 0, arr.length-1,target);
        if(targetIndex!= -1){
            System.out.println("Element found at index " + targetIndex);
        }else{
            System.out.println("Element not found in array");
        }
    }
}