import java.util.*;

class nxtGreater{
    public static void main(String[] args) {
        int arr[] = {7,2,5,};
        Stack<Integer> s = new Stack<Integer>();
        int nxtG[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--) {
            //  int index = i % n;
            //1
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            //2
            if(s.isEmpty()){
                nxtG[i] = -1;
            }
            else{
                nxtG[i] = arr[s.peek()];
            }
            //3
            s.push(i);
        }
        for(int i=0;i<nxtG.length;i++) {
            System.out.print(nxtG[i] + " ");
        }
    }
}