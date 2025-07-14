import java.util.ArrayList;
class Basic{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
          root.left =  insert(root.left, val);
        }else{
          root.right = insert(root.right, val);
        }

        return root;
    }


    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }

        if(root.data == val){
            return true;
        }else if(root.data > val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }

    //Delete a node from BST
    public static Node delete(Node root,int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            //Case 1: No child
            if(root.left == null && root.right == null){
                return null;
            }
            //Case 2: One child
            else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            //Case 3: Two children
            else{
               Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                delete(root.right, IS.data);
            }
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    //Print all elements in the range [k1, k2]
    //Time complexity: O(h + k) where h is the height of the tree and k is the number of nodes in the range

    public static void printInRange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    //print root to leaf
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);

    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    ///Valid BST
    public static boolean isValidBST(Node root, Node min, Node max){
       if(root == null){
        return true;
       }


       if(min != null && root.data <= min.data){
        return false;
       }else if(max != null && root.data >= max.data){
        return false;
       }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    //Mirror BST
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }


        Node LS = mirror(root.left);
        Node RS = mirror(root.right);
        root.left = RS;
        root.right = LS;
        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static Node createBST(int arr[], int start, int end){
        if(start > end){
            return null;
        }

       int mid = (start+end)/2;
       Node root = new Node(arr[mid]);

       root.left = createBST(arr, start, mid-1);
       root.right = createBST(arr, mid+1, end);
       return root;
    }

    //Balanced BST
    public static Node balancedBST(Node root){
        ArrayList<Integer> inorderList = new ArrayList<>();
        getInorder(root, inorderList);
        root = createBalancedBST(inorderList, 0, inorderList.size() - 1);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> inorderList){
        if(root == null){
            return;
        }

        getInorder(root.left, inorderList);
        inorderList.add(root.data);
        getInorder(root.right, inorderList);
    }
    public static Node createBalancedBST(ArrayList<Integer> inorderList, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(inorderList.get(mid));

        root.left = createBalancedBST(inorderList, start, mid - 1);
        root.right = createBalancedBST(inorderList, mid + 1, end);
        return root;
    }


    public static void main(String[] args) {
        // int values[] = {8};
        // Node root = null;

        // for(int i=0; i<values.length; i++){
        //     root = insert(root, values[i]);
        // }

        // inorder(root);
        // System.out.println("");


        // root = delete(root,6);
        // inorder(root);

        // printInRange(root,5,12);

        // printRootToLeaf(root, new ArrayList<Integer>());

    // if(isValidBST(root, null, null)){
    //     System.out.println("Valid BST");
    // }else{
    //     System.out.println("Not a valid BST");
    // }


    // root = mirror(root);
    // System.out.println("Mirror of BST: ");
    // preorder(root);

    // int arr[] = {5,3,7,2,4,6,8};
    // Node root = createBST(arr, 0, arr.length-1);
    // System.out.println("Inorder of BST: ");
    // preorder(root);

    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);

    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right= new Node(12);


    root = balancedBST(root);
    preorder(root);
       
    }
}