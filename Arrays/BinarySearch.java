import java.util.*;

class BinarySearch{
    public static int Binary(int numbers[] , int target){
        int start = 0;
        int end= numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid] == target){
                return mid;
            }else if(numbers[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {23,94,100,63,21,9,3,9,10,56};

        Arrays.sort(numbers);//we can use the binary sort or any sorting algorithm instead of Arrays.sort method


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        int index = Binary(numbers, target);
        if(index == -1){
            System.out.println("Target value is not FOUND!");
        }else{
            System.out.println("Target value found at index: " + index);
        }
    }
}