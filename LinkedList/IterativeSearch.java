
class iterativeSearch{

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


    public int itrSearch(int key){
        Node temp = head;
        int i =0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }


    public void reverseIterate(){
        Node  prev = null;
        Node curr = tail=head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void DeleteNNodeFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if( sz == n){
            head = head.next;
            return;
        }

        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

   

    public static void main(String[] args){
        iterativeSearch ll = new iterativeSearch();
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addFirst(5);
        ll.print();


        // ll.reverseIterate();
        // ll.print();

        // System.out.println("Search 20: " + ll.recSearch(60));
        // ll.print();

    //     ll.DeleteNNodeFromEnd(2);
    //     ll.print();
    }
}