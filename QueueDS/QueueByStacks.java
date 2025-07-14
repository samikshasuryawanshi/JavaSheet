import java.util.*;

class QueueByStacks{
    static  class Queue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        //empty
        public boolean isEmpty(){
            return stack1.isEmpty();
        }

        //enqueue
        public  void enqueue(int data){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }

            stack1.push(data);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        //remove
        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.pop();
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return stack1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.dequeue();
        }
    }
}