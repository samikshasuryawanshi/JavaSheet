class height{
   static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static  int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;

    }


    //Count of Nodes
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;

    }

    //Sum of nodes
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    //diameter of nodes
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

       int leftD = diameter(root.left);
       int rightD = diameter(root.right);
       int lh = height(root.left);
       int rh = height(root.right);


       int selfD = lh + rh + 1;
       return Math.max(selfD,Math.max(rightD,leftD));
    }


    static class Info{
        int diamt ;
        int ht ;

        public Info(int diamt, int ht){
            this.diamt = diamt;
            this.ht = ht;
        }
    }

    public static Info Diam(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftD = Diam(root.left);
        Info rightD = Diam(root.right);


        int diameter = Math.max(Math.max(leftD.diamt, rightD.diamt), leftD.ht+rightD.ht+1);

        int height = Math.max(leftD.ht, rightD.ht) + 1;

        return new Info(diameter, height);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        // System.out.println("Height of the tree is: " + height(root));
        // System.out.println("Number of nodes in the tree is: " + count(root));

        // System.out.println("Sum of nodes in the tree is: " + sum(root));

        // System.out.println("Diameter of the tree is: " + diameter(root));

        Info info = Diam(root);
        System.out.println("Diameter of the tree is: " + info.diamt);
        System.out.println("Height of the tree is: " + info.ht);
    }
}