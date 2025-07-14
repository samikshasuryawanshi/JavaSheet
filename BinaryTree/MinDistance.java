import java.util.ArrayList;
class MinDistance{
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        if(leftLCA == null) {
            return rightLCA;
        }

        if(rightLCA == null) {
            return leftLCA;
        }

        return root;
    }

    public static int minDistance(Node root, int n1, int n2) {
       Node lca = lca2(root, n1, n2);
       int D1 = findDistance(lca, n1);
       int D2 = findDistance(lca, n2);
       return D1 + D2;
    }

    public static int findDistance(Node root, int n) {
       if(root == null){
            return -1;
       }
       if(root.data == n){
         return 0;
       }
       int left = findDistance(root.left, n);
       int right = findDistance(root.right, n);


         if(left == -1 && right == -1){
            return -1;
         }else if(left == -1){
            return right + 1;
         }else {
            return left + 1;
         }

        
    }





    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 6;
        int distance = minDistance(root, n1, n2);
        System.out.println("Minimum distance between " + n1 + " and " + n2 + " is: " + distance);
    }
}