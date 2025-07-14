class HeapSort{


    public static void heapify(int arr[], int i, int n){
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, largest, n);
        }
    }



    public static void heapSort(int arr[]){
        //create a max heap
        int n = arr.length;

        for(int i = n/2-1;i>=0;i--){
            heapify(arr, i, n);
        }

        //push max elements at the top
        for(int i = n-1;i>=0;i--){
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};

        heapSort(arr);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}