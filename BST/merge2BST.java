import java.util.ArrayList;
class merge2BST{
     static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);
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



    public  static Node merge(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);


        //merge 
        int i = 0,j = 0;
        ArrayList<Integer> finalList = new ArrayList<>();

        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalList.add(arr1.get(i));
                i++;
            }else{
                finalList.add(arr2.get(j));
                j++;
            }
        }

        while(i < arr1.size()){
            finalList.add(arr1.get(i));
            i++;
        }


        while(j < arr2.size()){
            finalList.add(arr2.get(j));
            j++;
        }

        //create BST from finalList
        return createBST(finalList, 0, finalList.size() - 1);
    }

    public static void main(String[] args) {
        //BST 1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);


        //BST 2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node mergedRoot = merge(root1, root2);
        System.out.println("Merged BST Preorder: ");
        preorder(mergedRoot);

    }
        

}