import java.util.*;

class basic{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        public static void preOrder(Node root){
            if(root == null){
              return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }


        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }


        public static  void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()){
              Node currNode = queue.poll();
              if(currNode == null){
                System.out.println("");
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
              }else{
                System.out.print(currNode.data + " ");
                if(currNode.left!= null){
                    queue.add(currNode.left);
                }
                if(currNode.right!= null){
                    queue.add(currNode.right);
                }
              }
            }
        }
    }
    public static void main(String[] args) {
       int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildTree(nodes);
      

    //   tree.preOrder(root);
    // tree.inOrder(root);
    // tree.postOrder(root);
    tree.levelOrder(root);

    }
}