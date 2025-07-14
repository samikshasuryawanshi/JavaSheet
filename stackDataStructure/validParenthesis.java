import java.util.*;

class validParenthesis{
    public static boolean isValid(String str){
        int count=0;
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                //we need to check weather the stack is empty or not
               if(stack.isEmpty()){
                    return false;
                }

                if((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' &&
                 ch == '}') || (stack.peek() == '[' && ch == ']')){

                    stack.pop();
                }
                else{
                    return false;
                }
            }
           
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }



    //code for longest valid parenthesis
     public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base case to handle edge cases
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                stack.push(i); // Store index of '('
            } else {
                stack.pop(); // Remove matching '('

                if (stack.isEmpty()) {
                    stack.push(i); // Push current index to act as a boundary
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String str = "()(()";
        System.out.println(isValid(str)); // true

    }
}