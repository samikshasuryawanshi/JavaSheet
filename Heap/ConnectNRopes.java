import java.util.*;
class ConnectNRopes{
    public static void main(String args[]){
        int ropes[] = {2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            int min = pq.remove();
            int secondMin = pq.remove();
            cost += (min + secondMin);
            pq.add(min + secondMin);
        }

        System.out.println("Minimum cost to connect ropes: " + cost);

    }

}