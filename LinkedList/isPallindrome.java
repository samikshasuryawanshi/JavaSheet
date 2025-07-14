

class isPallindrome{
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


//find ,id point of any linkedlist
    public Node findMid(Node head){
        Node slow = head; //+1
        Node fast = head; //+2

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPallindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //mid node
        Node mid = findMid(head);

        //reverse the second half
        Node prev = null;
        Node current = mid;
        Node next ;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node right = prev ; //right half hhead
        Node left = head;

        //check if they are equal
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    


    public static void main(String[] args) {
        isPallindrome ll = new isPallindrome();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(1);
        ll.print();

        System.out.println("Is Palindrome: " + ll.checkPallindrome());  //true
    }
}