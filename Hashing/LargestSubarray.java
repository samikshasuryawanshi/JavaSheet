import java.util.HashMap;
class LargestSubarray{

    public static void main(String[] args) {
        
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;


        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println("Length of the largest subarray with sum 0 is: " + maxLength);
    }
}