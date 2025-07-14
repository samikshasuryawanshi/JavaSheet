import java.util.*;

class Basic{
    // static  class queue{
    //     static int arr[];
    //    static int size;
    //    static  int rear;
    //    static  int front;
    //    queue(int n){
    //        arr = new int[n];
    //        size = 0;
    //        rear = -1;
    //        front = -1;
    //    }

    //    //is empty
    //    public static boolean isEmpty(){
    //        return rear == -1 && front == -1;
    //    }

    //    //full
    //    public static boolean isFull(){
    //        return (rear+1) % size == front;
    //    }

    //    //add
    // //    public static void add(int data){
    // //     if(isEmpty()){
    // //         System.out.println("queue is empty");
    // //     }
    // //     rear= rear+1;
    // //     arr[rear] = data;
    // //    }

    //    //add in circular q
    //    public static void add(int data){
    //     if(isFull()){
    //         System.out.println("Queue is full");
    //         return;
    //     }
    //     if(front == -1){
    //         front = 0;
    //     }
    //     rear = (rear+1) % size;
    //     arr[rear] = data;
    //    }

    //    //remove
    // //    public static int remove(){
    // //     if(isEmpty()){
    // //         System.out.println("Queue is empty");
    // //         return -1;
    // //     }
    // //     int front = arr[0];
    // //     for(int i=0; i<rear; i++){
    // //         arr[i] = arr[i+1];
    // //     }
    // //     rear = rear-1;
    // //     return front;
    // //    }


    //    public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("Queue is empty");
    //         return -1;
    //     }
    //     int result = arr[front];
    //     if(front == rear){
    //         front = rear = -1;
    //     }else{
    //         front = (front+1) % size;
    //     }
    //     return result;
    //    }

    //    //peek
    //    public static int peek(){
    //     if(isEmpty()){
    //         System.out.println("Queue is empty");
    //         return -1;
    //     }
    //     return arr[front];
    //    }
    // }
    public static void main(String[] args) {
    //   Queue<Integer> q = new LinkedList<>();

    Queue<Integer> q = new ArrayDeque<>();

      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);

      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }

    }
}