package no.mikaelaj.hiof.oblig4;

public class BinarySearchTree {
    private Node root;

    // Tree Constructor
    public BinarySearchTree() {
        root = null;
    }

    public void insert(String word) {
        if (root == null) {
            root = new Node(word);
            return;
        }
        insert(root, word);
    }
    private void insert(Node root, String word) {
        int result = word.compareToIgnoreCase(root.data);

        if (result == 0) {
            root.incrementCount();
            return;
        }
        else {
            if (result<0) {
                if (root.left == null) {
                    root.left = new Node(word);
                }
                else
                    insert(root.left, word);
            }
            else {
                if (root.right == null)
                    root.right = new Node(word);
                else
                    insert(root.right, word);
            }
        }
    }
    public void inorder() {
        System.out.print("In order: ");
        inorder(root);
        System.out.println("\n");
    }
    // Internal, private recursive inorder printout
    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            root.write();
            inorder(root.right);
        }
    }
}
