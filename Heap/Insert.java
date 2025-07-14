import java.util.ArrayList;
class Insert{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private  void heapify(int index){
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if(left < arr.size() && arr.get(left) < arr.get(smallest)){
                smallest = left;
            }
            if(right < arr.size() && arr.get(right) < arr.get(smallest)){
                smallest = right;
            }
            if(smallest != index){
                int temp = arr.get(index);
                arr.set(index, arr.get(smallest));
                arr.set(smallest, temp);
                heapify(smallest);
            }
        }


        public int remove(){
           int data = arr.get(0);
           int temp = arr.get(0);
           arr.set(0, arr.get(arr.size()-1));
           arr.set(arr.size()-1, temp);

              arr.remove(arr.size()-1);

              heapify(0);
              return data;
           
        }


        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(10);
        h.add(20);
        h.add(5);
        h.add(6);
        h.add(1);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();

        }


    }
}