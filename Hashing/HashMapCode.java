import java.util.*;
class HashMapCode{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(k key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @suppressWarnings("unchecked")
        public HashMap(int N){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for(int i = 0; i < N; i++){
                buckets[i] = new LinkedList<>();
            }
        }


        private int hashFunction(K key){
            return Math.abs(key.hashCode()) % N;
        }

        private int searchInLinkedList(K key, int bucketIndex){
            LinkedList<Node> bucket = buckets[bucketIndex];
            for(int i = 0; i < bucket.size(); i++){
                Node node = bucket.get(i);
              if(node.key == key){
                return dataIndex;
              }
            return -1; 
            }
        }

        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[2 * N];
            N = 2*N;

            for(int i =0;i <buckets.Length;i++){
                buckets[i] = new LinkedList<>();
            }

            for(int j =0;j<oldeBuckets.length;j++){
               LinkedList<Node> oldBucket = oldBuckets[j];
                for(int i = 0; i < oldBucket.size(); i++){
                    Node node = oldBucket.remove();
                    put(node.key, node.value); // Reinsert the old nodes into the new buckets
                }
                    
            }
            
        }

        public void put(K key, V value){
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);

            if(dataIndex != -1){
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value; // Update the value if key already exists
            } else {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }

            double Lambda = n/N;
            if(Lambda > 2.0){
                rehash();
            }
        }
    }
    public static void main(String args[]){

        HashMap<String, Integer> map = new HashMap<>(4);
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5); // This should trigger a rehash
       
    }
}