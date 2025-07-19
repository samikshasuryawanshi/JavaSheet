import java.util.*;
class HashMapBasic{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Samiksha",20);
        map.put("Aarav",25);
        map.put("Rishabh",21);
        map.put("sam",23);
        map.put("okay",22);


        

        // System.out.println("Initial HashMap: " + map);


        // int age = map.get("Aarav");
        // System.out.println("Age of Aarav: " + age);

        // //containsKey
        // System.out.println("Contains key 'Samiksha': " + map.containsKey("Samiksha"));
        // System.out.println("Contains key 'John': " + map.containsKey("okay"));


        // //remove
        // map.remove("Aarav");
        // System.out.println("HashMap after removing Aarav: " + map);

        // //size
        // System.out.println("Size of HashMap: " + map.size());

        // //isEmpty
        // System.out.println("Is hashMap empty? : " + map.isEmpty());

        // //clear
        // map.clear();
        // System.out.println("HashMap after clearing: " + map);



        // Iteration on HashMap
        Set<String> keys = map.keySet();
        System.out.println("Keys in HashMap: " + keys);

        for(String k : keys){
            System.out.println("Key: " + k + ", Value: " + map.get(k));
        }


    }
}