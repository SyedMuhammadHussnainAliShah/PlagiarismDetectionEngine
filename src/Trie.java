public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()) {
            if(!current.children.containsKey(ch)) {
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
        }
        current.isWord = true;
    }
    public boolean search(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()) {
            if(!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }
        return current.isWord;
    }
    public void insertDocument(Document document) {
        for(String word : document.getWords()) {
            insert(word);
        }
    }
    public void displayAllWords() {
        printWords(root, "");
    }
    private void printWords(TrieNode node, String word) {
        if(node.isWord) {
            System.out.println(word);
        }
        for(char ch : node.children.keySet()) {
            printWords(
                    node.children.get(ch),
                    word + ch
            );
        }
    }
}