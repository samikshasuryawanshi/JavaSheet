import java.util.*;
class MajorityElement{
    public static void main(String[] args){

        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        HashMap<Integer, Integer> map = new HashMap<>(10);

        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            if(map.get(key) > arr.length / 3){
                System.out.println("Majority Element: " + key);
                return;
            }
        }

    }

}