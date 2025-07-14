
import java.util.*;

class Basic{

    //>>>>>IMPLEMENTATION OF STACKS USING ARRAY-LIST>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // static class StackA{
    //     static ArrayList<Integer> list = new ArrayList<Integer>();
    //     //isempty
    //     public static boolean isEmpty(){
    //         return list.isEmpty();
    //     }

    //     //push
    //     public static void push(int value){
    //         list.add(value);
    //     }

    //     //pop
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     //peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }

    //>>>>>IMPLEMENTATION OF STACK USING LINKED-LIST>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // static class Node{
    //     int data;
    //     Node next;
    //     //constructor
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class StackL{
    //     static Node head = null;
    //     //isempty function
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }

    //     //push 
    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     //pop
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int popped = head.data;
    //         head = head.next;
    //         return popped;
    //     }

    //     //peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }

    public static void main(String[] args) {
       
        

        // StackL s = new StackL();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }
}