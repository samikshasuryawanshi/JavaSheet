import java.util.*;

class AtBottom{
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop(); //phle eleemnt ko nikalnge
        pushAtBottom(s,data); //uske baad isi function ko dusre k liye chla dena hai
        s.push(top);//phir uske bbaad hmare jo element ko nikala th usko wapas push krna
        
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s,top);

    }
    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);
        System.out.println("Reversed Stack:");
        printstack(stack);
        
    }
}