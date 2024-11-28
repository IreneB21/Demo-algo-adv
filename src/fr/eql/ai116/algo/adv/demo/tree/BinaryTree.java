package fr.eql.ai116.algo.adv.demo.tree;

public class BinaryTree {
    public Node root; // Racine de l'arbre.

    // Initialise un arbre vide.
    public BinaryTree() {
        this.root = null;
    }

    // Méthode pour ajouter une racine à l'arbre.
    public void addRoot(int data) {
        root = new Node(data);
    }

    public void display() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " - ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void displayMiddle() {
        middleOrderTraversal(root);
    }

    private void middleOrderTraversal(Node root) {
        if (root != null) {
            preOrderTraversal(root.left);
            System.out.print(root.data + " - ");
            preOrderTraversal(root.right);
        }
    }
}

/*
                 10
            5          15
         3     7
 */