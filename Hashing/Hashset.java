import java.util.*;
class Hashset{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //loop
        for(String city : cities) {
            System.out.println(city);
        }


    }
}