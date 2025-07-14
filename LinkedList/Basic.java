
import java.util.LinkedList;

class Basic{
    public static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    //head and tail of the linkedlist
    public static Node head;
    public static Node tail;
    public static int size;




    //add a node at the first of the linkedlist
    public void addFirst(int data){
        //create a node
        Node newNode = new Node(data);
        size++;

        //empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //newnode next = head
        newNode.next = head;

        //update the head
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        size++;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addInMiddle(int idx,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;


        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        //i==idx-1
        newNode.next = temp.next;
        temp.next = newNode;
        
    }
    

    //remove data
    public int removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return  val;
    }




    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //find the second last node
        Node prev = head;
        for(int i=0;i<size-1;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return  val;
    }

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean CycleExist = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                CycleExist = true;
                break;
            }
        }
        if(CycleExist == false){
            System.out.println("No cycle present in the list");
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while(slow!= fast){
            prev =fast;
            slow = slow.next;
            fast = fast.next;
        }
        //break the cycle
        prev.next = null;
        System.out.println("Cycle removed");
    }
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();




        //create
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(2);
        list.add(3, 5);

        System.out.println(list);

        //remove
        list.removeFirst();
        list.removeLast();
        System.out.println(list);


        // Basic l1 = new Basic();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp; //not cycle
        // //1-2-3-2


        // System.out.println("Is cycle present ? : " + l1.isCycle());
        // removeCycle();
        // System.out.println("Is cycle present? : " + l1.isCycle());



        // l1.addFirst(2);
        // l1.addFirst(1);
        // l1.addLast(3);
        // l1.addInMiddle(2, 5);
        // l1.addLast(4);
        // l1.removeFirst();
        // l1.removeLast();
        // l1.print();
        // System.out.println("Size of the list: " + l1.size);
    }
}