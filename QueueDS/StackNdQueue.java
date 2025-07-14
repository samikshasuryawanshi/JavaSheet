import java.util.*;
class StackNdQueue{
    static class Stack{
       Deque<Integer> dq = new LinkedList<>();

       public void push(int data){
           dq.addLast(data);
       }

       public int pop(){
           return dq.removeLast();
       }

       public int peek(){
           return dq.getLast();
       }
    }

    static class Queue{
       Deque<Integer> dq = new LinkedList<>();
       public void enqueue(int data){
           dq.addLast(data);
       }
       public int dequeue(){
           return dq.removeFirst();
       }
       public int peek(){
           return dq.getFirst();
       }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        
        System.out.println("peek : "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());



        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("peek : "+q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }

}