import java.util.*;

class StacksByQueue{
    static class Stacks{
      static Queue<Integer> q1 = new LinkedList<>();
      static Queue<Integer> q2 = new LinkedList<>();

      //is empty
      public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
      }

      //add
      public static void add(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
      }

      //remove
      public static int remove(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }

        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }else{
             while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
      }

      //peek
      public static int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top = q2.remove();
                q1.add(top);
            }
        }
        return top;
      }
      
    }
    public static void main(String[] args) {
       Stacks s = new Stacks();
       s.add(1);
       s.add(2);
       s.add(3);
       
       while(!s.isEmpty()){
         System.out.print(s.peek() + " ");
         s.remove();
       }
    }
}