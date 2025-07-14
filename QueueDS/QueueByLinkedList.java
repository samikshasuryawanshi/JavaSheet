
class QueueByLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        //isEmpty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public static void enqueue(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
           int front = head.data;
           if(tail==head){
            tail=head=null;
           }else{
            head = head.next;
           }
           return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}