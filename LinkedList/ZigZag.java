class ZigZag{
       public static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

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
    //find mid
    public void zZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        //reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftH = head;
        Node rightH = prev;
        Node nextL,nextR;
        while(leftH!= null && rightH!= null){
            nextL = leftH.next;
            leftH.next =rightH;
            nextR = rightH.next;
            rightH.next = nextL;


            leftH = nextL;
            rightH = nextR;
        }

    }



    public static void main(String[] args) {
        ZigZag list = new ZigZag();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        System.out.println("Original List");
        list.print();

        System.out.println("\nAfter ZigZag Conversion");
        list.zZag();
        list.print();

    }

}