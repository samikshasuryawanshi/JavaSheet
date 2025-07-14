import java.util.*;

class LinearSearch{
    public static int LinearSearch(int num[],int key){
        for(int i =0;i<num.length;i++){
            if(num[i] == key){
                return i;
            }
        }
         return -1; // if number is not found in the array.
    }
    public static void main(String[] args) {
        int num [] = {2,5,6,9,7,10,11,12,13,14,15,16,17};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search : ");
        int key = sc.nextInt();

        int index = LinearSearch(num, key);
        if(index == -1){
            System.out.println("Number not found in array.");
        } else {
            System.out.println("Number found at index : "+index);
        }
    }
}