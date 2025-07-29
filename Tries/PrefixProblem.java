class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int count = 0;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            count = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            } else {
                curr.children[index].count++;
            }
            curr = curr.children[index];
        }
        curr.eow = true; // Mark end of word
    }

    // Method to find and print shortest unique prefix of all words
    public static void findPrefixes(String[] words) {
        for (String word : words) {
            StringBuilder prefix = new StringBuilder();
            Node curr = root;

            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                prefix.append(word.charAt(i));

                if (curr.children[index].count == 1) {
                    break; // unique prefix found
                }
                curr = curr.children[index];
            }

            System.out.println(word + " -> " + prefix.toString());
        }
    }

    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};

        // Insert all words into Trie
        for (String word : words) {
            insert(word);
        }

        // Find and print shortest unique prefixes
        findPrefixes(words);
    }
}
