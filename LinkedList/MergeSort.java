import java.util.LinkedList;

class MergeSort{
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

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private  Node merge(Node h1,Node h2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(h1!=null && h2!=null){
            if(h1.data < h2.data){
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while(h1 != null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while(h2!= null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node left = mSort(head);
        Node right = mSort(rightHead);

        return merge(left, right);
    }
    public static void main(String[] args) {
        MergeSort list = new MergeSort(); //scratch

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(6);
        list.addFirst(4);
        list.addFirst(5);

        System.out.println("Original list: ");
        list.print();

        System.out.println("Sorted list: ");
        list.head = list.mSort(list.head);
        list.print();

       
    }
}