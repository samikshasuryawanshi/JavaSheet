class DoublyLL{
    public class Node{
        int data;
        Node next;
        Node prev;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add node at linked list
    public void addFirst(int data){
        //code here
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        //code here
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //remove operation
    public int removeFirst(){
        //code here
        if(head == null){
            System.out.println("DLL is empty");
            return -1;
        }
        if(size == 1){
            int data = head.data;
            head = tail = null;
            size --;
            return data;
        }

        int data = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }

    public int removeLast(){
        //code here
        if(head == null){
            System.out.println("DLL is empty");
            return -1;
        }
        if(size == 1){
            int data = tail.data;
            head = tail = null;
            size --;
            return data;
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return data;
    }

    //reverse doubly ll
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            //update
            prev = curr;
            curr = next;
        }
        head = prev;  //update head
    }


    public void print(){
        //code here
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addLast(20);
        dll.addLast(10);
        dll.print(); 
        System.out.println(dll.size);

      

        dll.reverse();
        dll.print();
        // System.out.println(dll.size);
    }
}