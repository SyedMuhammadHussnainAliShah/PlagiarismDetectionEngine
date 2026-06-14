public class BST {
    private BSTNode root;
    public void insert(String phrase) {
        root = insertRecursive(root, phrase);
    }
    private BSTNode insertRecursive(BSTNode node, String phrase) {
        if(node == null) {
            return new BSTNode(phrase);
        }
        if(phrase.compareTo(node.phrase) < 0) {
            node.left = insertRecursive(node.left, phrase);
        }
        else if(phrase.compareTo(node.phrase) > 0) {
            node.right = insertRecursive(node.right, phrase);
        }
        return node;
    }
    public boolean search(String phrase) {
        return searchRecursive(root, phrase);
    }
    private boolean searchRecursive(BSTNode node, String phrase) {
        if(node == null) {
            return false;
        }
        if(node.phrase.equals(phrase)) {
            return true;
        }
        if(phrase.compareTo(node.phrase) < 0) {
            return searchRecursive(node.left, phrase);
        }
        return searchRecursive(node.right, phrase);
    }
    public void display() {
        inorder(root);
    }
    private void inorder(BSTNode node) {
        if(node != null) {
            inorder(node.left);
            System.out.println(node.phrase);
            inorder(node.right);
        }
    }
}