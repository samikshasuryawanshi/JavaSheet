class kthAncestor{
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static int KthAncestor(Node root, int k, int node) {
        if (root == null) {
            return -1;
        }

        if (root.data == node) {
            return 0;
        }

        int left = KthAncestor(root.left, k, node);
        int right = KthAncestor(root.right, k, node);

        if (left == -1 && right == -1) {
            return -1;
        }

       int max = Math.max(left, right);
       if(max + 1 == k){
           System.out.println(root.data);
       }
        return max+1;
    }
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        int k = 1; // Kth ancestor to find
        int node = 7; // Node to find the Kth ancestor for
        KthAncestor(root, k, node);
        
    }
}