import java.util.HashMap;
class SubArraySum{
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("Count of subarrays with sum " + k + " is: " + count);
    }
}