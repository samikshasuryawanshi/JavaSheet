class Basic{
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i =0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static  void insert(String word){
        Node curr = root;
        for(int level =0;level<word.length();level++){
            int index = word.charAt(level) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true; // Mark the end of the word
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level =0;level<key.length();level++){
            int index = key.charAt(level) - 'a';
            if(curr.children[index] == null){
                return false; // Not found
            }
            curr = curr.children[index];
        }
        return curr.eow == true; // Return true if it's the end of a word
    }

    public static boolean wordBreaki(String key){
        if(key.length() == 0){
            return true; // Base case: empty string can be segmented
        }

        for(int i = 1; i <= key.length(); i++){
           if(search(key.substring(0,i)) && wordBreaki(key.substring(i))){
                return true; // If the prefix can be segmented and the rest can also be segmented
            }
        }
        return false; // No valid segmentation found
    }

    public static void main(String[] args) {
        String arr[] = {"i","like","samsung","samsungmobile","sam","samsungmobi","sams"};

        for(int i =0;i<arr.length;i++){
            insert(arr[i]);
        }

        String key = "ilikesamsung";
        System.out.println("Word Break Possible: " + wordBreaki(key));
    }
}